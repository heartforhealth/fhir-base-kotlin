package fhir.base.kotlin

import io.h4h.fhir.r4.base.Resource
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*



open class ResourceTest {

    val json = Json {
        prettyPrint = true
        explicitNulls = false
        ignoreUnknownKeys = true
        encodeDefaults = true
    }

    fun loadResource(name: String) = javaClass.classLoader
        .getResource(name)
        ?.readText()


    inline fun <reified T> deserializeSerializeResource(resource: String) {
        val data = json.decodeFromString<T>(resource)
        println(data)
        val string = json.encodeToString(data)
        println(string)
    }


}