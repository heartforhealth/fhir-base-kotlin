package fhir.base.kotlin

import com.github.jershell.kbson.*
import io.h4h.fhir.r4.base.Quantity
import org.bson.BsonDocument
import org.bson.BsonInt32
import org.bson.BsonString
import kotlin.test.Test


class QuantityTest : ResourceTest() {


    private val quantity1 = """
    {
        "value": 91.38848360568589,
        "unit": "kg",
        "system": "http://unitsofmeasure.org",
        "code": "kg"
    }
    """.trimIndent()

    private val quantity2 = """
    {
        "value": 91,
        "unit": "kg",
        "system": "http://unitsofmeasure.org",
        "code": "kg"
    }
    """.trimIndent()


    @Test fun serializationTest1() = deserializeSerializeResource<Quantity>(quantity1)
    @Test fun serializationTest2() = deserializeSerializeResource<Quantity>(quantity2)


    private val kBson = KBson(
        configuration = Configuration(nonEncodeNull = true)
    )


    @Test fun quantityTest() {

        val document = BsonDocument()
        document["value"]  = BsonInt32(91)
        document["unit"]   = BsonString("kg")
        document["system"] = BsonString("http://unitsofmeasure.org")
        document["code"]   = BsonString("kg")


        // You can use load and dump with ByteArray
        val quantity = kBson.load(Quantity.serializer(), document)
        println("Quantity: $quantity")
    }


}