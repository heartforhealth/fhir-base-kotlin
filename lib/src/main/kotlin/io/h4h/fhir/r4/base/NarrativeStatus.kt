package io.h4h.fhir.r4.base

import kotlinx.serialization.Serializable


@Serializable
enum class NarrativeStatus : CodeableEnumeration {
    /**
     * The contents of the narrative are entirely generated from the core elements in the content.
     */
    GENERATED,

    /**
     * The contents of the narrative are entirely generated from the core elements in the content and some of the content is generated from extensions. The narrative SHALL reflect the impact of all modifier extensions.
     */
    EXTENSIONS,

    /**
     * The contents of the narrative may contain additional information not found in the structured data. Note that there is no computable way to determine what the extra information is, other than by human inspection.
     */
    ADDITIONAL,

    /**
     * The contents of the narrative are some equivalent of "No human-readable text provided in this case".
     */
    EMPTY;


    override val code: String?
        get() = when (this) {
            GENERATED -> "generated"
            EXTENSIONS -> "extensions"
            ADDITIONAL -> "additional"
            EMPTY -> "empty"
        }


    override val system: String?
        get() = when (this) {
            GENERATED -> "http://hl7.org/fhir/narrative-status"
            EXTENSIONS -> "http://hl7.org/fhir/narrative-status"
            ADDITIONAL -> "http://hl7.org/fhir/narrative-status"
            EMPTY -> "http://hl7.org/fhir/narrative-status"
        }


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