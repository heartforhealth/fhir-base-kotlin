package io.h4h.fhir.r4.base



enum class IdentifierUse : CodeableEnumeration {

    /**
     * The identifier recommended for display and use in real-world interactions.
     */
    usual,

    /**
     * The identifier considered to be most trusted for the identification of this item. Sometimes also known as "primary" and "main". The determination of "official" is subjective and implementation guides often provide additional guidelines for use.
     */
    official,

    /**
     * A temporary identifier.
     */
    temp,

    /**
     * An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.
     */
    secondary,

    /**
     * The identifier id no longer considered valid, but may be relevant for search purposes.  E.g. Changes to identifier schemes, account merges, etc.
     */
    old;


    override val code = name

    override val system = "http://hl7.org/fhir/identifier-use"

    override val definition: String
        get() = when (this) {
            usual -> "The identifier recommended for display and use in real-world interactions."
            official -> "The identifier considered to be most trusted for the identification of this item. Sometimes also known as \"primary\" and \"main\". The determination of \"official\" is subjective and implementation guides often provide additional guidelines for use."
            temp -> "A temporary identifier."
            secondary -> "An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context."
            old -> "The identifier id no longer considered valid, but may be relevant for search purposes.  E.g. Changes to identifier schemes, account merges, etc."
        }

    override val display: String
        get() = when (this) {
            usual -> "Usual"
            official -> "Official"
            temp -> "Temp"
            secondary -> "Secondary"
            old -> "Old"
        }

}