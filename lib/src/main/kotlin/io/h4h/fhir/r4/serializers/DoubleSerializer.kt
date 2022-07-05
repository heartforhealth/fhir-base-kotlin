package io.h4h.fhir.r4.serializers



import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder


/**
 * Custom serializer for Double that fallbacks to Int for deserialization
 * */
@Serializer(forClass = Double::class)
object DoubleSerializer : KSerializer<Double> {

    override val descriptor = PrimitiveSerialDescriptor("DoubleInt", PrimitiveKind.DOUBLE)

    override fun serialize(encoder: Encoder, value: Double) {
        encoder.encodeDouble(value)
    }

    override fun deserialize(decoder: Decoder): Double {
        return try {
            // first try to decode Double
            decoder.decodeDouble()
        } catch (doubleException: Exception) {
            try {
                // then maybe it is an Int
                decoder.decodeInt().toDouble()
            } catch (intException: Exception) {
                // throw further
                throw SerializationException(intException)
            }
        }
    }

}