package io.h4h.fhir.r4.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
enum class QuantityComparator : CodeableEnumeration {

    /**
     * The actual value is less than the given value.
     */
    @SerialName("<")
    LESS_THAN,

    /**
     * The actual value is less than or equal to the given value.
     */
    @SerialName("<=")
    LESS_OR_EQUAL,

    /**
     * The actual value is greater than or equal to the given value.
     */
    @SerialName(">=")
    GREATER_OR_EQUAL,

    /**
     * The actual value is greater than the given value.
     */
    @SerialName(">")
    GREATER_THAN;


    override val code: String
        get() = when (this) {
            LESS_THAN -> "<"
            LESS_OR_EQUAL -> "<="
            GREATER_OR_EQUAL -> ">="
            GREATER_THAN -> ">"
        }

    override val system = "http://hl7.org/fhir/quantity-comparator"

    override val definition: String
        get() = when (this) {
            LESS_THAN -> "The actual value is less than the given value."
            LESS_OR_EQUAL -> "The actual value is less than or equal to the given value."
            GREATER_OR_EQUAL -> "The actual value is greater than or equal to the given value."
            GREATER_THAN -> "The actual value is greater than the given value."
        }

    override val display: String
        get() = when (this) {
            LESS_THAN -> "Less than"
            LESS_OR_EQUAL -> "Less or Equal to"
            GREATER_OR_EQUAL -> "Greater or Equal to"
            GREATER_THAN -> "Greater than"
        }

}