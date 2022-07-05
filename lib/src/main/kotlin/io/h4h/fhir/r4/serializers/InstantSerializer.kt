package io.h4h.fhir.r4.serializers

import kotlinx.datetime.Instant
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder


/**
 * Custom serializer for Instant that fallbacks to Long for deserialization
 * */
@Serializer(forClass = Instant::class)
object InstantSerializer: KSerializer<Instant> {

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("InstantStringLong", PrimitiveKind.STRING)


    override fun serialize(encoder: Encoder, value: Instant) {
        // encoder.encodeLong(value.toEpochMilliseconds())
        encoder.encodeString(value.toString())
    }


    override fun deserialize(decoder: Decoder): Instant {
        return try {
            // first try to decode String
            Instant.parse(decoder.decodeString())
        } catch (stringException: Exception) {
            try {
                // then maybe it is a Long
                Instant.fromEpochMilliseconds(decoder.decodeLong())
            } catch (longException: Exception) {
                // throw further
                throw SerializationException(longException)
            }
        }
    }


}

