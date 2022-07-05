package io.h4h.fhir.r4.codesystems

import io.h4h.fhir.r4.base.CodeableEnumeration
import kotlinx.serialization.SerialName


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
// Generated on Wed, Jan 30, 2019 16:19-0500 for FHIR v4.0.0


/**
 * Set of terminology concepts related to Observation Interpretation
 * @see <a href="http://hl7.org/fhir/R4/valueset-observation-interpretation.html">HL7 link</a>
 * */
@kotlinx.serialization.Serializable
enum class ObservationInterpretation : CodeableEnumeration {
    /**
     * Codes that specify interpretation of genetic analysis, such as "positive", "negative", "carrier", "responsive", etc.
     */
    /// _GENETICOBSERVATIONINTERPRETATION,

    /**
     * The patient is considered as carrier based on the testing results. A carrier is an individual who carries an altered form of a gene which can lead to having a child or offspring in future generations with a genetic disorder.
     */
    CAR,


    /**
     * Interpretations of change of quantity and/or severity. At most one of B or W and one of U or D allowed.
     */
    /// _OBSERVATIONINTERPRETATIONCHANGE,

    /**
     * The current result or observation value has improved compared to the previous result or observation value (the change is significant as defined in the respective test procedure).
     *
     * [Note: This can be applied to quantitative or qualitative observations.]
     */
    B,

    /**
     * The current result has decreased from the previous result for a quantitative observation (the change is significant as defined in the respective test procedure).
     */
    D,

    /**
     * The current result has increased from the previous result for a quantitative observation (the change is significant as defined in the respective test procedure).
     */
    U,

    /**
     * The current result or observation value has degraded compared to the previous result or observation value (the change is significant as defined in the respective test procedure).
     *
     * [Note: This can be applied to quantitative or qualitative observations.]
     */
    W,

    /**
     * Technical exceptions resulting in the inability to provide an interpretation. At most one allowed. Does not imply normality or severity.
     */
    /// _OBSERVATIONINTERPRETATIONEXCEPTIONS,

    /**
     * The result is below the minimum detection limit (the test procedure or equipment is the limiting factor).
     *
     * Synonyms: Below analytical limit, low off scale.
     */
    @SerialName("<")
    LESS_THAN,

    /**
     * The result is above the maximum quantifiable limit (the test procedure or equipment is the limiting factor).
     *
     * Synonyms: Above analytical limit, high off scale.
     */
    @SerialName(">")
    GREATER_THAN,


    /**
     * There is insufficient evidence that the species in question is a good target for therapy with the drug.  A categorical interpretation is not possible.
     *
     * [Note: A MIC with "IE" and/or a comment may be reported (without an accompanying S, I or R-categorization).]
     */
    IE,


    /**
     * Interpretation of normality or degree of abnormality (including critical or "alert" level). Concepts in this category are mutually exclusive, i.e., at most one is allowed.
     */
    /// _OBSERVATIONINTERPRETATIONNORMALITY,

    /**
     * The result or observation value is outside the reference range or expected norm (as defined for the respective test procedure).
     *
     * [Note: Typically applies to non-numeric results.]
     */
    A,

    /**
     * The result or observation value is outside a reference range or expected norm at a level at which immediate action should be considered for patient safety (as defined for the respective test procedure).
     *
     * [Note: Typically applies to non-numeric results.  Analogous to critical/panic limits for numeric results.]
     */
    AA,

    /**
     * The result for a quantitative observation is above a reference level at which immediate action should be considered for patient safety (as defined for the respective test procedure).
     *
     * Synonym: Above upper panic limits.
     */
    HH,

    /**
     * The result for a quantitative observation is below a reference level at which immediate action should be considered for patient safety (as defined for the respective test procedure).
     *
     * Synonym: Below lower panic limits.
     */
    LL,

    /**
     * The result for a quantitative observation is above the upper limit of the reference range (as defined for the respective test procedure).
     *
     * Synonym: Above high normal
     */
    H,


    /**
     * A test result that is significantly higher than the reference (normal) or therapeutic interval, but has not reached the critically high value and might need special attention, as defined by the laboratory or the clinician.
     */
    HU,

    /**
     * The result for a quantitative observation is below the lower limit of the reference range (as defined for the respective test procedure).
     *
     * Synonym: Below low normal
     */
    L,


    /**
     * A test result that is significantly lower than the reference (normal) or therapeutic interval, but has not reached the critically low value and might need special attention, as defined by the laboratory or the clinician.
     */
    LU,

    /**
     * The result or observation value is within the reference range or expected norm (as defined for the respective test procedure).
     *
     * [Note: Applies to numeric or non-numeric results.]
     */
    N,

    /**
     * Interpretations of anti-microbial susceptibility testing results (microbiology). At most one allowed.
     */
    /// _OBSERVATIONINTERPRETATIONSUSCEPTIBILITY,

    /**
     * Bacterial strain inhibited in vitro by a concentration of an antimicrobial agent that is associated with uncertain therapeutic effect. Reference: CLSI (http://www.clsi.org/Content/NavigationMenu/Resources/HarmonizedTerminologyDatabase/Harmonized_Terminolo.htm)
     * Projects: ISO 20776-1, ISO 20776-2
     *
     * [Note 1: Bacterial strains are categorized as intermediate by applying the appropriate breakpoints in a defined phenotypic test system.]
     *
     * [Note 2: This class of susceptibility implies that an infection due to the isolate can be appropriately treated in body sites where the drugs are physiologically concentrated or when a high dosage of drug can be used.]
     *
     * [Note 3: This class also indicates a "buffer zone," to prevent small, uncontrolled, technical factors from causing major discrepancies in interpretations.]
     *
     * [Note 4: These breakpoints can be altered due to changes in circumstances (e.g., changes in commonly used drug dosages, emergence of new resistance mechanisms).]
     */
    I,

    /**
     * Use when not enough clinical trial data published by the Clinical and Laboratory Standards Institutes (CLSI) is available to establish the breakpoints for susceptible / intermediate and resistant.
     */
    NCL,

    /**
     * A category used for isolates for which only a susceptible interpretive criterion has been designated because of the absence or rare occurrence of resistant strains. Isolates that have MICs above or zone diameters below the value indicated for the susceptible breakpoint should be reported as non-susceptible.
     *
     * NOTE 1: An isolate that is interpreted as non-susceptible does not necessarily mean that the isolate has a resistance mechanism. It is possible that isolates with MICs above the susceptible breakpoint that lack resistance mechanisms may be encountered within the wild-type distribution subsequent to the time the susceptible-only breakpoint is set.
     *
     * NOTE 2: For strains yielding results in the "nonsusceptible" category, organism identification and antimicrobial susceptibility test results should be confirmed.
     *
     * Synonym: decreased susceptibility.
     */
    NS,

    /**
     * Bacterial strain inhibited in vitro by a concentration of an antimicrobial agent that is associated with a high likelihood of therapeutic failure.
     * Reference: CLSI (http://www.clsi.org/Content/NavigationMenu/Resources/HarmonizedTerminologyDatabase/Harmonized_Terminolo.htm)
     * Projects: ISO 20776-1, ISO 20776-2
     *
     * [Note 1: Bacterial strains are categorized as resistant by applying the appropriate breakpoints in a defined phenotypic test system.]
     *
     * [Note 2: This breakpoint can be altered due to changes in circumstances (e.g., changes in commonly used drug dosages, emergence of new resistance mechanisms).]
     */
    R,

    /**
     * A category for isolates where the bacteria (e.g. enterococci) are not susceptible in vitro to a combination therapy (e.g., high-level aminoglycoside and cell wall active agent).  This is predictive that this combination therapy will not be effective.
     *
     *
     * Usage Note: Since the use of penicillin or ampicillin alone often results in treatment failure of serious enterococcal or other bacterial infections, combination therapy is usually indicated to enhance bactericidal activity. The synergy between a cell wall active agent (such as penicillin, ampicillin, or vancomycin) and an aminoglycoside (such as gentamicin, kanamycin or streptomycin) is best predicted by screening for high-level bacterial resistance to the aminoglycoside.
     *
     *
     * Open Issue: The print name of the code is very general and the description is very specific to a pair of classes of agents, which may lead to confusion of these concepts in the future should other synergies be found.
     */
    SYNR,

    /**
     * Bacterial strain inhibited by in vitro concentration of an antimicrobial agent that is associated with a high likelihood of therapeutic success.
     * Reference: CLSI (http://www.clsi.org/Content/NavigationMenu/Resources/HarmonizedTerminologyDatabase/Harmonized_Terminolo.htm)
     * Synonym (earlier term): Sensitive Projects: ISO 20776-1, ISO 20776-2
     *
     * [Note 1: Bacterial strains are categorized as susceptible by applying the appropriate breakpoints in a defined phenotypic system.]
     *
     * [Note 2: This breakpoint can be altered due to changes in circumstances (e.g., changes in commonly used drug dosages, emergence of new resistance mechanisms).]
     */
    S,

    /**
     * A category that includes isolates with antimicrobial agent minimum inhibitory concentrations (MICs) that approach usually attainable blood and tissue levels and for which response rates may be lower than for susceptible isolates.
     *
     * Reference: CLSI document M44-A2 2009 "Method for antifungal disk diffusion susceptibility testing of yeasts; approved guideline - second edition" - page 2.
     */
    SDD,

    /**
     * A category for isolates where the bacteria (e.g. enterococci) are susceptible in vitro to a combination therapy (e.g., high-level aminoglycoside and cell wall active agent).  This is predictive that this combination therapy will be effective.
     *
     *
     * Usage Note: Since the use of penicillin or ampicillin alone often results in treatment failure of serious enterococcal or other bacterial infections, combination therapy is usually indicated to enhance bactericidal activity. The synergy between a cell wall active agent (such as penicillin, ampicillin, or vancomycin) and an aminoglycoside (such as gentamicin, kanamycin or streptomycin) is best predicted by screening for high-level bacterial resistance to the aminoglycoside.
     *
     *
     * Open Issue: The print name of the code is very general and the description is very specific to a pair of classes of agents, which may lead to confusion of these concepts in the future should other synergies be found.
     */
    @SerialName("SYN-S")
    SYNS,


    /**
     * The observation/test result is interpreted as being outside the inclusion range for a particular protocol within which the result is being reported.
     *
     *
     * Example: A positive result on a Hepatitis screening test.
     * Open Issue: EX, HX, LX: These three concepts do not seem to meet a clear need in the vocabulary, and their use in observation interpretation appears likely to be covered by other existing concepts (e.g., A, H, L).  The only apparent significant difference is their reference to use in protocols for exclusion of study subjects.
     * These concepts/codes were proposed by RCRIM for use in the CTLaboratory message.  They were submitted and approved in the November 2005 Harmonization cycle in proposal "030103C_VOCAB_RCRIM_l_quade_RCRIM Obs Interp_20051028154455".  However, this proposal was not fully implemented in the vocabulary.  The proposal recommended creation of the x_ClinicalResearchExclusion domain in ObservationInterpretation with a value set including those three concepts/codes, but there is no subdomain of that name or equivalent with a binding to either of the value sets that contain these concepts/codes.
     * Members of the OO WG have recently attempted to contact members of RCRIM regarding these concepts, both by email and at the recent WGM in Atlanta, without response.  It is felt by OO that the best course of action to take at this time is to add this comprehensive Open Issue rather than deprecate these three concepts at this time, until further discussion is held.
     */
    EX,

    /**
     * The observation/test result is interpreted as being outside the inclusion range for a particular protocol within which the result is being reported.
     *
     *
     * Example: A positive result on a Hepatitis screening test.
     * Open Issue: EX, HX, LX: These three concepts do not seem to meet a clear need in the vocabulary, and their use in observation interpretation appears likely to be covered by other existing concepts (e.g., A, H, L).  The only apparent significant difference is their reference to use in protocols for exclusion of study subjects.  These concepts/codes were proposed by RCRIM for use in the CTLaboratory message.  They were submitted and approved in the November 2005 Harmonization cycle in proposal "030103C_VOCAB_RCRIM_l_quade_RCRIM Obs Interp_20051028154455". However, this proposal was not fully implemented in the vocabulary.  The proposal recommended creation of the x_ClinicalResearchExclusion domain in ObservationInterpretation with a value set including those three concepts/codes, but there is no subdomain of that name or equivalent with a binding to either of the value sets that contain these concepts/codes.  Members of the OO WG have recently attempted to contact members of RCRIM regarding these concepts, both by email and at the recent WGM in Atlanta, without response.  It is felt by OO that the best course of action to take at this time is to add this comprehensive Open Issue rather than deprecate these three concepts at this time, until further discussion is held.
     */
    HX,

    /**
     * The numeric observation/test result is interpreted as being below the low threshold value for a particular protocol within which the result is being reported.
     *
     * Example: A Total White Blood Cell Count falling below a protocol-defined threshold value of 3000/mm^3
     * Open Issue: EX, HX, LX: These three concepts do not seem to meet a clear need in the vocabulary, and their use in observation interpretation appears likely to be covered by other existing concepts (e.g., A, H, L).  The only apparent significant difference is their reference to use in protocols for exclusion of study subjects.  These concepts/codes were proposed by RCRIM for use in the CTLaboratory message.  They were submitted and approved in the November 2005 Harmonization cycle in proposal "030103C_VOCAB_RCRIM_l_quade_RCRIM Obs Interp_20051028154455".  However, this proposal was not fully implemented in the vocabulary.  The proposal recommended creation of the x_ClinicalResearchExclusion domain in ObservationInterpretation with a value set including those three concepts/codes, but there is no subdomain of that name or equivalent with a binding to either of the value sets that contain these concepts/codes.  Members of the OO WG have recently attempted to contact members of RCRIM regarding these concepts, both by email and at the recent WGM in Atlanta, without response.  It is felt by OO that the best course of action to take at this time is to add this comprehensive Open Issue rather than deprecate these three concepts at this time, until further discussion is held.
     */
    LX,

    /**
     * Hold for Medical Review
     *
     *
     * Usage Note: This code is not intended for use in V3 artifacts.  It is included in the code system to maintain alignment with the V2 Table 0078 "Interpretation Codes."
     */
    HM,

    /**
     * Interpretations of the presence or absence of a component / analyte or organism in a test or of a sign in a clinical observation. In keeping with laboratory data processing practice, these concepts provide a categorical interpretation of the "meaning" of the quantitative value for the same observation.
     */
    /// OBSERVATIONINTERPRETATIONDETECTION,

    /**
     * The specified component / analyte, organism or clinical sign could neither be declared positive / negative nor detected / not detected by the performed test or procedure.
     *
     *
     * Usage Note: For example, if the specimen was degraded, poorly processed, or was missing the required anatomic structures, then "indeterminate" (i.e. "cannot be determined") is the appropriate response, not "equivocal".
     */
    IND,

    /**
     * The test or procedure was successfully performed, but the results are borderline and can neither be declared positive / negative nor detected / not detected according to the current established criteria.
     */
    E,

    /**
     * An absence finding of the specified component / analyte, organism or clinical sign based on the established threshold of the performed test or procedure.
     *
     * [Note: Negative does not necessarily imply the complete absence of the specified item.]
     */
    NEG,

    /**
     * The presence of the specified component / analyte, organism or clinical sign could not be determined within the limit of detection of the performed test or procedure.
     */
    ND,

    /**
     * A presence finding of the specified component / analyte, organism or clinical sign based on the established threshold of the performed test or procedure.
     */
    POS,

    /**
     * The measurement of the specified component / analyte, organism or clinical sign above the limit of detection of the performed test or procedure.
     */
    DET,

    /**
     * Interpretation of the observed result taking into account additional information (contraindicators) about the patient's situation. Concepts in this category are mutually exclusive, i.e., at most one is allowed.
     */
    /// OBSERVATIONINTERPRETATIONEXPECTATION,

    /**
     * This result has been evaluated in light of known contraindicators.  Once those contraindicators have been taken into account the result is determined to be "Expected"  (e.g., presence of drugs in a patient that is taking prescription medication for pain management).
     */
    EXP,

    /**
     * This result has been evaluated in light of known contraindicators.  Once those contraindicators have been taken into account the result is determined to be "Unexpected" (e.g., presence of non-prescribed drugs in a patient that is taking prescription medication for pain management).
     */
    UNE,

    /**
     * Interpretation qualifiers in separate OBX segments
     *
     *
     * Usage Note: This code is not intended for use in V3 artifacts.  It is included in the code system to maintain alignment with the V2 Table 0078 "Interpretation Codes."
     */
    OBX,

    /**
     * Interpretations of the presence and level of reactivity of the specified component / analyte with the reagent in the performed laboratory test.
     */
    /// REACTIVITYOBSERVATIONINTERPRETATION

    /**
     * An absence finding used to indicate that the specified component / analyte did not react measurably with the reagent.
     */
    NR,

    /**
     * A presence finding used to indicate that the specified component / analyte reacted with the reagent above the reliably measurable limit of the performed test.
     */
    RR,

    /**
     * A weighted presence finding used to indicate that the specified component / analyte reacted with the reagent, but below the reliably measurable limit of the performed test.
     */
    WR;


    override val code: String
        get() = when (this) {
            CAR -> "CAR"
            B -> "B"
            D -> "D"
            U -> "U"
            W -> "W"
            LESS_THAN -> "<"
            GREATER_THAN -> ">"
            IE -> "IE"
            A -> "A"
            AA -> "AA"
            HH -> "HH"
            LL -> "LL"
            H -> "H"
            HU -> "HU"
            L -> "L"
            LU -> "LU"
            N -> "N"
            I -> "I"
            NCL -> "NCL"
            NS -> "NS"
            R -> "R"
            SYNR -> "SYN-R"
            S -> "S"
            SDD -> "SDD"
            SYNS -> "SYN-S"
            EX -> "EX"
            HX -> "HX"
            LX -> "LX"
            HM -> "HM"
            IND -> "IND"
            E -> "E"
            NEG -> "NEG"
            ND -> "ND"
            POS -> "POS"
            DET -> "DET"
            EXP -> "EXP"
            UNE -> "UNE"
            OBX -> "OBX"
            NR -> "NR"
            RR -> "RR"
            WR -> "WR"
        }


    override val system = "http://terminology.hl7.org/CodeSystem/v3-ObservationInterpretation"


    override val definition: String?
        get() = when (this) {
            CAR -> "The patient is considered as carrier based on the testing results. A carrier is an individual who carries an altered form of a gene which can lead to having a child or offspring in future generations with a genetic disorder."
            B -> "The current result or observation value has improved compared to the previous result or observation value (the change is significant as defined in the respective test procedure).\r\n\n                        [Note: This can be applied to quantitative or qualitative observations.]"
            D -> "The current result has decreased from the previous result for a quantitative observation (the change is significant as defined in the respective test procedure)."
            U -> "The current result has increased from the previous result for a quantitative observation (the change is significant as defined in the respective test procedure)."
            W -> "The current result or observation value has degraded compared to the previous result or observation value (the change is significant as defined in the respective test procedure).\r\n\n                        [Note: This can be applied to quantitative or qualitative observations.]"
            LESS_THAN -> "The result is below the minimum detection limit (the test procedure or equipment is the limiting factor).\r\n\n                        Synonyms: Below analytical limit, low off scale."
            GREATER_THAN -> "The result is above the maximum quantifiable limit (the test procedure or equipment is the limiting factor).\r\n\n                        Synonyms: Above analytical limit, high off scale."
            IE -> "There is insufficient evidence that the species in question is a good target for therapy with the drug.  A categorical interpretation is not possible.\r\n\n                        [Note: A MIC with \"IE\" and/or a comment may be reported (without an accompanying S, I or R-categorization).]"
            A -> "The result or observation value is outside the reference range or expected norm (as defined for the respective test procedure).\r\n\n                        [Note: Typically applies to non-numeric results.]"
            AA -> "The result or observation value is outside a reference range or expected norm at a level at which immediate action should be considered for patient safety (as defined for the respective test procedure).\r\n\n                        [Note: Typically applies to non-numeric results.  Analogous to critical/panic limits for numeric results.]"
            HH -> "The result for a quantitative observation is above a reference level at which immediate action should be considered for patient safety (as defined for the respective test procedure).\r\n\n                        Synonym: Above upper panic limits."
            LL -> "The result for a quantitative observation is below a reference level at which immediate action should be considered for patient safety (as defined for the respective test procedure).\r\n\n                        Synonym: Below lower panic limits."
            H -> "The result for a quantitative observation is above the upper limit of the reference range (as defined for the respective test procedure).\r\n\n                        Synonym: Above high normal"
            HU -> "A test result that is significantly higher than the reference (normal) or therapeutic interval, but has not reached the critically high value and might need special attention, as defined by the laboratory or the clinician."
            L -> "The result for a quantitative observation is below the lower limit of the reference range (as defined for the respective test procedure).\r\n\n                        Synonym: Below low normal"
            LU -> "A test result that is significantly lower than the reference (normal) or therapeutic interval, but has not reached the critically low value and might need special attention, as defined by the laboratory or the clinician."
            N -> "The result or observation value is within the reference range or expected norm (as defined for the respective test procedure).\r\n\n                        [Note: Applies to numeric or non-numeric results.]"
            I -> "Bacterial strain inhibited in vitro by a concentration of an antimicrobial agent that is associated with uncertain therapeutic effect. Reference: CLSI (http://www.clsi.org/Content/NavigationMenu/Resources/HarmonizedTerminologyDatabase/Harmonized_Terminolo.htm)\nProjects: ISO 20776-1, ISO 20776-2\r\n\n                        [Note 1: Bacterial strains are categorized as intermediate by applying the appropriate breakpoints in a defined phenotypic test system.]\r\n\n                        [Note 2: This class of susceptibility implies that an infection due to the isolate can be appropriately treated in body sites where the drugs are physiologically concentrated or when a high dosage of drug can be used.]\r\n\n                        [Note 3: This class also indicates a \"buffer zone,\" to prevent small, uncontrolled, technical factors from causing major discrepancies in interpretations.]\r\n\n                        [Note 4: These breakpoints can be altered due to changes in circumstances (e.g., changes in commonly used drug dosages, emergence of new resistance mechanisms).]"
            NCL -> "Use when not enough clinical trial data published by the Clinical and Laboratory Standards Institutes (CLSI) is available to establish the breakpoints for susceptible / intermediate and resistant."
            NS -> "A category used for isolates for which only a susceptible interpretive criterion has been designated because of the absence or rare occurrence of resistant strains. Isolates that have MICs above or zone diameters below the value indicated for the susceptible breakpoint should be reported as non-susceptible.\r\n\n                        NOTE 1: An isolate that is interpreted as non-susceptible does not necessarily mean that the isolate has a resistance mechanism. It is possible that isolates with MICs above the susceptible breakpoint that lack resistance mechanisms may be encountered within the wild-type distribution subsequent to the time the susceptible-only breakpoint is set. \r\n\n                        NOTE 2: For strains yielding results in the \"nonsusceptible\" category, organism identification and antimicrobial susceptibility test results should be confirmed.\r\n\n                        Synonym: decreased susceptibility."
            R -> "Bacterial strain inhibited in vitro by a concentration of an antimicrobial agent that is associated with a high likelihood of therapeutic failure.\nReference: CLSI (http://www.clsi.org/Content/NavigationMenu/Resources/HarmonizedTerminologyDatabase/Harmonized_Terminolo.htm)  \nProjects: ISO 20776-1, ISO 20776-2\r\n\n                        [Note 1: Bacterial strains are categorized as resistant by applying the appropriate breakpoints in a defined phenotypic test system.]\r\n\n                        [Note 2: This breakpoint can be altered due to changes in circumstances (e.g., changes in commonly used drug dosages, emergence of new resistance mechanisms).]"
            SYNR -> "A category for isolates where the bacteria (e.g. enterococci) are not susceptible in vitro to a combination therapy (e.g., high-level aminoglycoside and cell wall active agent).  This is predictive that this combination therapy will not be effective. \r\n\n                        \n                           Usage Note: Since the use of penicillin or ampicillin alone often results in treatment failure of serious enterococcal or other bacterial infections, combination therapy is usually indicated to enhance bactericidal activity. The synergy between a cell wall active agent (such as penicillin, ampicillin, or vancomycin) and an aminoglycoside (such as gentamicin, kanamycin or streptomycin) is best predicted by screening for high-level bacterial resistance to the aminoglycoside.\r\n\n                        \n                           Open Issue: The print name of the code is very general and the description is very specific to a pair of classes of agents, which may lead to confusion of these concepts in the future should other synergies be found."
            S -> "Bacterial strain inhibited by in vitro concentration of an antimicrobial agent that is associated with a high likelihood of therapeutic success.\nReference: CLSI (http://www.clsi.org/Content/NavigationMenu/Resources/HarmonizedTerminologyDatabase/Harmonized_Terminolo.htm)\nSynonym (earlier term): Sensitive Projects: ISO 20776-1, ISO 20776-2\r\n\n                        [Note 1: Bacterial strains are categorized as susceptible by applying the appropriate breakpoints in a defined phenotypic system.]\r\n\n                        [Note 2: This breakpoint can be altered due to changes in circumstances (e.g., changes in commonly used drug dosages, emergence of new resistance mechanisms).]"
            SDD -> "A category that includes isolates with antimicrobial agent minimum inhibitory concentrations (MICs) that approach usually attainable blood and tissue levels and for which response rates may be lower than for susceptible isolates.\r\n\n                        Reference: CLSI document M44-A2 2009 \"Method for antifungal disk diffusion susceptibility testing of yeasts; approved guideline - second edition\" - page 2."
            SYNS -> "A category for isolates where the bacteria (e.g. enterococci) are susceptible in vitro to a combination therapy (e.g., high-level aminoglycoside and cell wall active agent).  This is predictive that this combination therapy will be effective. \r\n\n                        \n                           Usage Note: Since the use of penicillin or ampicillin alone often results in treatment failure of serious enterococcal or other bacterial infections, combination therapy is usually indicated to enhance bactericidal activity. The synergy between a cell wall active agent (such as penicillin, ampicillin, or vancomycin) and an aminoglycoside (such as gentamicin, kanamycin or streptomycin) is best predicted by screening for high-level bacterial resistance to the aminoglycoside.\r\n\n                        \n                           Open Issue: The print name of the code is very general and the description is very specific to a pair of classes of agents, which may lead to confusion of these concepts in the future should other synergies be found."
            EX -> "The observation/test result is interpreted as being outside the inclusion range for a particular protocol within which the result is being reported.\n\r\n\n                        Example: A positive result on a Hepatitis screening test.\n                           Open Issue: EX, HX, LX: These three concepts do not seem to meet a clear need in the vocabulary, and their use in observation interpretation appears likely to be covered by other existing concepts (e.g., A, H, L).  The only apparent significant difference is their reference to use in protocols for exclusion of study subjects.\nThese concepts/codes were proposed by RCRIM for use in the CTLaboratory message.  They were submitted and approved in the November 2005 Harmonization cycle in proposal \"030103C_VOCAB_RCRIM_l_quade_RCRIM Obs Interp_20051028154455\".  However, this proposal was not fully implemented in the vocabulary.  The proposal recommended creation of the x_ClinicalResearchExclusion domain in ObservationInterpretation with a value set including those three concepts/codes, but there is no subdomain of that name or equivalent with a binding to either of the value sets that contain these concepts/codes.\nMembers of the OO WG have recently attempted to contact members of RCRIM regarding these concepts, both by email and at the recent WGM in Atlanta, without response.  It is felt by OO that the best course of action to take at this time is to add this comprehensive Open Issue rather than deprecate these three concepts at this time, until further discussion is held."
            HX -> "The observation/test result is interpreted as being outside the inclusion range for a particular protocol within which the result is being reported.\n\r\n\n                        Example: A positive result on a Hepatitis screening test.\n                           Open Issue: EX, HX, LX: These three concepts do not seem to meet a clear need in the vocabulary, and their use in observation interpretation appears likely to be covered by other existing concepts (e.g., A, H, L).  The only apparent significant difference is their reference to use in protocols for exclusion of study subjects.  These concepts/codes were proposed by RCRIM for use in the CTLaboratory message.  They were submitted and approved in the November 2005 Harmonization cycle in proposal \"030103C_VOCAB_RCRIM_l_quade_RCRIM Obs Interp_20051028154455\". However, this proposal was not fully implemented in the vocabulary.  The proposal recommended creation of the x_ClinicalResearchExclusion domain in ObservationInterpretation with a value set including those three concepts/codes, but there is no subdomain of that name or equivalent with a binding to either of the value sets that contain these concepts/codes.  Members of the OO WG have recently attempted to contact members of RCRIM regarding these concepts, both by email and at the recent WGM in Atlanta, without response.  It is felt by OO that the best course of action to take at this time is to add this comprehensive Open Issue rather than deprecate these three concepts at this time, until further discussion is held."
            LX -> "The numeric observation/test result is interpreted as being below the low threshold value for a particular protocol within which the result is being reported.\r\n\n                        Example: A Total White Blood Cell Count falling below a protocol-defined threshold value of 3000/mm^3\n                           Open Issue: EX, HX, LX: These three concepts do not seem to meet a clear need in the vocabulary, and their use in observation interpretation appears likely to be covered by other existing concepts (e.g., A, H, L).  The only apparent significant difference is their reference to use in protocols for exclusion of study subjects.  These concepts/codes were proposed by RCRIM for use in the CTLaboratory message.  They were submitted and approved in the November 2005 Harmonization cycle in proposal \"030103C_VOCAB_RCRIM_l_quade_RCRIM Obs Interp_20051028154455\".  However, this proposal was not fully implemented in the vocabulary.  The proposal recommended creation of the x_ClinicalResearchExclusion domain in ObservationInterpretation with a value set including those three concepts/codes, but there is no subdomain of that name or equivalent with a binding to either of the value sets that contain these concepts/codes.  Members of the OO WG have recently attempted to contact members of RCRIM regarding these concepts, both by email and at the recent WGM in Atlanta, without response.  It is felt by OO that the best course of action to take at this time is to add this comprehensive Open Issue rather than deprecate these three concepts at this time, until further discussion is held."
            HM -> "Hold for Medical Review\r\n\n                        \n                           Usage Note: This code is not intended for use in V3 artifacts.  It is included in the code system to maintain alignment with the V2 Table 0078 \"Interpretation Codes.\""
            IND -> "The specified component / analyte, organism or clinical sign could neither be declared positive / negative nor detected / not detected by the performed test or procedure.\r\n\n                        \n                           Usage Note: For example, if the specimen was degraded, poorly processed, or was missing the required anatomic structures, then \"indeterminate\" (i.e. \"cannot be determined\") is the appropriate response, not \"equivocal\"."
            E -> "The test or procedure was successfully performed, but the results are borderline and can neither be declared positive / negative nor detected / not detected according to the current established criteria."
            NEG -> "An absence finding of the specified component / analyte, organism or clinical sign based on the established threshold of the performed test or procedure.\r\n\n                        [Note: Negative does not necessarily imply the complete absence of the specified item.]"
            ND -> "The presence of the specified component / analyte, organism or clinical sign could not be determined within the limit of detection of the performed test or procedure."
            POS -> "A presence finding of the specified component / analyte, organism or clinical sign based on the established threshold of the performed test or procedure."
            DET -> "The measurement of the specified component / analyte, organism or clinical sign above the limit of detection of the performed test or procedure."
            EXP -> "This result has been evaluated in light of known contraindicators.  Once those contraindicators have been taken into account the result is determined to be \"Expected\"  (e.g., presence of drugs in a patient that is taking prescription medication for pain management)."
            UNE -> "This result has been evaluated in light of known contraindicators.  Once those contraindicators have been taken into account the result is determined to be \"Unexpected\" (e.g., presence of non-prescribed drugs in a patient that is taking prescription medication for pain management)."
            OBX -> "Interpretation qualifiers in separate OBX segments\r\n\n                        \n                           Usage Note: This code is not intended for use in V3 artifacts.  It is included in the code system to maintain alignment with the V2 Table 0078 \"Interpretation Codes.\""
            NR -> "An absence finding used to indicate that the specified component / analyte did not react measurably with the reagent."
            RR -> "A presence finding used to indicate that the specified component / analyte reacted with the reagent above the reliably measurable limit of the performed test."
            WR -> "A weighted presence finding used to indicate that the specified component / analyte reacted with the reagent, but below the reliably measurable limit of the performed test."
        }


    override val display: String
        get() = when (this) {
            CAR -> "Carrier"
            B -> "Better"
            D -> "Significant change down"
            U -> "Significant change up"
            W -> "Worse"
            LESS_THAN -> "Off scale low"
            GREATER_THAN -> "Off scale high"
            IE -> "Insufficient evidence"
            A -> "Abnormal"
            AA -> "Critical abnormal"
            HH -> "Critical high"
            LL -> "Critical low"
            H -> "High"
            HU -> "Significantly high"
            L -> "Low"
            LU -> "Significantly low"
            N -> "Normal"
            I -> "Intermediate"
            NCL -> "No CLSI defined breakpoint"
            NS -> "Non-susceptible"
            R -> "Resistant"
            SYNR -> "Synergy - resistant"
            S -> "Susceptible"
            SDD -> "Susceptible-dose dependent"
            SYNS -> "Synergy - susceptible"
            EX -> "outside threshold"
            HX -> "above high threshold"
            LX -> "below low threshold"
            HM -> "Hold for Medical Review"
            IND -> "Indeterminate"
            E -> "Equivocal"
            NEG -> "Negative"
            ND -> "Not detected"
            POS -> "Positive"
            DET -> "Detected"
            EXP -> "Expected"
            UNE -> "Unexpected"
            OBX -> "Interpretation qualifiers in separate OBX segments"
            NR -> "Non-reactive"
            RR -> "Reactive"
            WR -> "Weakly reactive"
        }

}