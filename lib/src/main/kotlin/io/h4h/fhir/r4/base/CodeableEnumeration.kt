package io.h4h.fhir.r4.base



interface CodeableEnumeration {

    val display: String?
    val definition: String?
    val system: String?
    val code: String?



    /// export FHIR Coding
    val coding: Coding
        get() = Coding(
            display = display,
            system = system,
            code = code
        )

    /// export FHIR CodeableConcept
    val codeableConcept: CodeableConcept
        get() = CodeableConcept(
            coding = listOf(coding),
            text = display
        )

}