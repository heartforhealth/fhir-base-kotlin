package fhir.base.kotlin

import org.bson.BsonDocument
import org.bson.BsonInt64

private const val PeriodStartDateField = "start"
private const val PeriodEndDateField = "end"


/// before deserialization
fun BsonDocument.preDeserialize(): BsonDocument {
    /// iof we have a DateTime field, rewrite it as the underlying type (Long)
    this[PeriodStartDateField]?.let { value ->
        if (value.isDateTime) {
            // rewrite date field as Long
            this[PeriodStartDateField] = BsonInt64(value.asDateTime().value)
        }
    }

    this[PeriodEndDateField]?.let { value ->
        if (value.isDateTime) {
            // rewrite date field as Long
            this[PeriodEndDateField] = BsonInt64(value.asDateTime().value)
        }
    }

    return this
}