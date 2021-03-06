/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package fhir.base.kotlin

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import io.h4h.ehealth.core.AuditEvent
import io.h4h.ehealth.core.AuditEventType
import io.h4h.fhir.r4.base.Identifier
import io.h4h.fhir.r4.base.Reference
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.fail

class LibraryTest {

    private val jsonWriter = ObjectMapper()
        .setSerializationInclusion(JsonInclude.Include.NON_NULL)
        .writerWithDefaultPrettyPrinter()


    @Test fun auditEventJacksonSerializationTest() {

        val auditEvent = AuditEvent(
            name = "programCreated",
            type = AuditEventType.Created,
            author = Reference(
                type = "Practitioner",
                identifier = Identifier(value = "7d7028dc-71e8-408d-9d58-3f58b938c55f")
            ),
            context = Reference(
                type = "Program",
                identifier = Identifier(value = "a609992e-b656-4fa3-8cda-d92471641e1c")
            ),
        )

        val json = jsonWriter.writeValueAsString(auditEvent)
        println(json)
    }

    @Test fun auditEventJacksonDeserializationTest() {

        try {
            // deserialize event
            val event = ObjectMapper()
                .readValue(event1, AuditEvent::class.java)

            println("event: $event")

            assertTrue { event.author?.identifier?.value == "7d7028dc-71e8-408d-9d58-3f58b938c55f" }
            assertTrue { event.context?.identifier?.value == "a609992e-b656-4fa3-8cda-d92471641e1c" }

        } catch (e: JsonProcessingException) {
            fail(e.localizedMessage, e)
        }
    }

    private val event1 = """
        {
          "name" : "programCreated",
          "type" : "Created",
          "author" : {
            "type" : "Practitioner",
            "identifier" : {
              "value" : "7d7028dc-71e8-408d-9d58-3f58b938c55f"
            }
          },
          "dateTime" : "2022-05-24T11:31:43.376505Z",
          "context" : {
            "type" : "Program",
            "identifier" : {
              "value" : "a609992e-b656-4fa3-8cda-d92471641e1c"
            }
          }
        }
    """.trimIndent()
}
