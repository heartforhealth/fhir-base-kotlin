package fhir.base.kotlin

import io.h4h.fhir.r4.base.Extension
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.encodeToString
import kotlin.test.Test
import kotlin.test.assertEquals


class ExtensionTest : ResourceTest() {


    // the shape practitioners' annotations on Observations take; this used to fail with
    // "Class discriminator was missing ... polymorphic scope of 'Annotation'" because
    // valueAnnotation resolved to kotlin.Annotation instead of the FHIR Annotation
    private val annotationExtension = """
    {
        "url": "https://heartforhealth.com/fhir/StructureDefinition/annotation",
        "valueAnnotation": {
            "authorReference": {
                "type": "Practitioner",
                "identifier": { "value": "87f8de50-7b6a-459f-8b5d-d08da9aca840" },
                "display": "Jane Doe"
            },
            "time": "2026-11-18T14:43:07.175Z",
            "text": "Checked with patient"
        }
    }
    """.trimIndent()


    @Test fun valueAnnotationTest() {
        val annotation = json.decodeFromString<Extension>(annotationExtension).valueAnnotation!!

        assertEquals("Practitioner", annotation.authorReference?.type)
        assertEquals("2026-11-18T14:43:07.175Z", annotation.time)
        assertEquals("Checked with patient", annotation.text)
    }


    // Extension.equals only compares the url, so compare the annotation itself
    @Test fun valueAnnotationRoundTripTest() {
        val extension = json.decodeFromString<Extension>(annotationExtension)
        val roundTripped = json.decodeFromString<Extension>(json.encodeToString(extension))

        assertEquals(extension.valueAnnotation, roundTripped.valueAnnotation)
    }


    // a property whose type isn't defined in this library silently falls back to a kotlin.* type
    // (that's how valueAnnotation became kotlin.Annotation); those serialize polymorphically or
    // contextually and can't be decoded from plain FHIR JSON
    @Test fun noPolymorphicOrContextualElementsTest() {
        val offending = mutableListOf<String>()
        val visited = mutableSetOf<String>()

        fun walk(descriptor: SerialDescriptor, path: String) {
            if (descriptor.kind is PolymorphicKind || descriptor.kind == SerialKind.CONTEXTUAL)
                offending += "$path: ${descriptor.serialName}"
            if (!visited.add(descriptor.serialName)) return
            for (i in 0 until descriptor.elementsCount)
                walk(descriptor.getElementDescriptor(i), "$path.${descriptor.getElementName(i)}")
        }
        walk(Extension.serializer().descriptor, "Extension")

        assertEquals(emptyList(), offending)
    }


}
