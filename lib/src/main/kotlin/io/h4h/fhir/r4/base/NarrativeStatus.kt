package io.h4h.fhir.r4.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
enum class NarrativeStatus : CodeableEnumeration {

    /**
     * The contents of the narrative are entirely generated from the core elements in the content.
     */
    @SerialName("generated")
    GENERATED,

    /**
     * The contents of the narrative are entirely generated from the core elements in the content and some of the content is generated from extensions. The narrative SHALL reflect the impact of all modifier extensions.
     */
    @SerialName("extensions")
    EXTENSIONS,

    /**
     * The contents of the narrative may contain additional information not found in the structured data. Note that there is no computable way to determine what the extra information is, other than by human inspection.
     */
    @SerialName("additional")
    ADDITIONAL,

    /**
     * The contents of the narrative are some equivalent of "No human-readable text provided in this case".
     */
    @SerialName("empty")
    EMPTY;


    override val code: String
        get() = when (this) {
            GENERATED -> "generated"
            EXTENSIONS -> "extensions"
            ADDITIONAL -> "additional"
            EMPTY -> "empty"
        }


    override val system = "http://hl7.org/fhir/narrative-status"


    override val definition: String?
        get() = when (this) {
            GENERATED -> "The contents of the narrative are entirely generated from the core elements in the content."
            EXTENSIONS -> "The contents of the narrative are entirely generated from the core elements in the content and some of the content is generated from extensions. The narrative SHALL reflect the impact of all modifier extensions."
            ADDITIONAL -> "The contents of the narrative may contain additional information not found in the structured data. Note that there is no computable way to determine what the extra information is, other than by human inspection."
            EMPTY -> "The contents of the narrative are some equivalent of \"No human-readable text provided in this case\"."
        }


    override val display: String?
        get() = when (this) {
            GENERATED -> "Generated"
            EXTENSIONS -> "Extensions"
            ADDITIONAL -> "Additional"
            EMPTY -> "Empty"
        }

}