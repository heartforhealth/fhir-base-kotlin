package fhir.base.kotlin

import com.github.jershell.kbson.Configuration
import com.github.jershell.kbson.KBson
import io.h4h.fhir.r4.base.Period
import org.bson.BsonDateTime
import org.bson.BsonDocument
import kotlin.test.Test


class PeriodTest : ResourceTest() {


    private val period = """
    {
        "start": "2023-04-05T00:00:00+00:00",
        "end": "2023-04-10T00:00:00+00:00"
    }
    """.trimIndent()


    @Test fun serializationTest() = deserializeSerializeResource<Period>(period)


    private val kBson = KBson(
        configuration = Configuration(nonEncodeNull = true)
    )


    @Test fun periodTest() {
        val document = BsonDocument()

        document["start"]  = BsonDateTime(1695718517)
        document["end"]  = BsonDateTime(1695718517)

        // You can use load and dump with ByteArray
        val period = kBson.load(Period.serializer(), document.preDeserialize())
        println("Period: $period")
    }

}