package io.h4h.fhir.r4.base


import kotlinx.serialization.Serializable


@Serializable
enum class ResourceType {

    Account,
    ActivityDefinition,
    AdverseEvent,
    AllergyIntolerance,
    Appointment,
    AppointmentResponse,
    AuditEvent,
    Basic,
    Binary,
    BiologicallyDerivedProduct,
    BodyStructure,
    Bundle,
    CapabilityStatement,
    CarePlan,
    CareTeam,
    CatalogEntry,
    ChargeItem,
    ChargeItemDefinition,
    Claim,
    ClaimResponse,
    ClinicalImpression,
    CodeSystem,
    Communication,
    CommunicationRequest,
    CompartmentDefinition,
    Composition,
    ConceptMap,
    Condition,
    Consent,
    Contract,
    Coverage,
    CoverageEligibilityRequest,
    CoverageEligibilityResponse,
    DetectedIssue,
    Device,
    DeviceDefinition,
    DeviceMetric,
    DeviceRequest,
    DeviceUseStatement,
    DiagnosticReport,
    DocumentManifest,
    DocumentReference,
    EffectEvidenceSynthesis,
    Encounter,
    Endpoint,
    EnrollmentRequest,
    EnrollmentResponse,
    EpisodeOfCare,
    EventDefinition,
    Evidence,
    EvidenceVariable,
    ExampleScenario,
    ExplanationOfBenefit,
    FamilyMemberHistory,
    Flag,
    Goal,
    GraphDefinition,
    Group,
    GuidanceResponse,
    HealthcareService,
    ImagingStudy,
    Immunization,
    ImmunizationEvaluation,
    ImmunizationRecommendation,
    ImplementationGuide,
    InsurancePlan,
    Invoice,
    Library,
    Linkage,
    List,
    Location,
    Measure,
    MeasureReport,
    Media,
    Medication,
    MedicationAdministration,
    MedicationDispense,
    MedicationKnowledge,
    MedicationRequest,
    MedicationStatement,
    MedicinalProduct,
    MedicinalProductAuthorization,
    MedicinalProductContraindication,
    MedicinalProductIndication,
    MedicinalProductIngredient,
    MedicinalProductInteraction,
    MedicinalProductManufactured,
    MedicinalProductPackaged,
    MedicinalProductPharmaceutical,
    MedicinalProductUndesirableEffect,
    MessageDefinition,
    MessageHeader,
    MolecularSequence,
    NamingSystem,
    NutritionOrder,
    Observation,
    ObservationDefinition,
    OperationDefinition,
    OperationOutcome,
    Organization,
    OrganizationAffiliation,
    Parameters,
    Patient,
    PaymentNotice,
    PaymentReconciliation,
    Person,
    PlanDefinition,
    Practitioner,
    PractitionerRole,
    Procedure,
    Provenance,
    Questionnaire,
    QuestionnaireResponse,
    RelatedPerson,
    RequestGroup,
    ResearchDefinition,
    ResearchElementDefinition,
    ResearchStudy,
    ResearchSubject,
    RiskAssessment,
    RiskEvidenceSynthesis,
    Schedule,
    SearchParameter,
    ServiceRequest,
    Slot,
    Specimen,
    SpecimenDefinition,
    StructureDefinition,
    StructureMap,
    Subscription,
    Substance,
    SubstanceNucleicAcid,
    SubstancePolymer,
    SubstanceProtein,
    SubstanceReferenceInformation,
    SubstanceSourceMaterial,
    SubstanceSpecification,
    SupplyDelivery,
    SupplyRequest,
    Task,
    TerminologyCapabilities,
    TestReport,
    TestScript,
    ValueSet,
    VerificationResult,
    VisionPrescription;



    val path: String
        get() = when (this) {
            Account -> "account"
            ActivityDefinition -> "activitydefinition"
            AdverseEvent -> "adverseevent"
            AllergyIntolerance -> "allergyintolerance"
            Appointment -> "appointment"
            AppointmentResponse -> "appointmentresponse"
            AuditEvent -> "auditevent"
            Basic -> "basic"
            Binary -> "binary"
            BiologicallyDerivedProduct -> "biologicallyderivedproduct"
            BodyStructure -> "bodystructure"
            Bundle -> "bundle"
            CapabilityStatement -> "capabilitystatement"
            CarePlan -> "careplan"
            CareTeam -> "careteam"
            CatalogEntry -> "catalogentry"
            ChargeItem -> "chargeitem"
            ChargeItemDefinition -> "chargeitemdefinition"
            Claim -> "claim"
            ClaimResponse -> "claimresponse"
            ClinicalImpression -> "clinicalimpression"
            CodeSystem -> "codesystem"
            Communication -> "communication"
            CommunicationRequest -> "communicationrequest"
            CompartmentDefinition -> "compartmentdefinition"
            Composition -> "composition"
            ConceptMap -> "conceptmap"
            Condition -> "condition"
            Consent -> "consent"
            Contract -> "contract"
            Coverage -> "coverage"
            CoverageEligibilityRequest -> "coverageeligibilityrequest"
            CoverageEligibilityResponse -> "coverageeligibilityresponse"
            DetectedIssue -> "detectedissue"
            Device -> "device"
            DeviceDefinition -> "devicedefinition"
            DeviceMetric -> "devicemetric"
            DeviceRequest -> "devicerequest"
            DeviceUseStatement -> "deviceusestatement"
            DiagnosticReport -> "diagnosticreport"
            DocumentManifest -> "documentmanifest"
            DocumentReference -> "documentreference"
            EffectEvidenceSynthesis -> "effectevidencesynthesis"
            Encounter -> "encounter"
            Endpoint -> "endpoint"
            EnrollmentRequest -> "enrollmentrequest"
            EnrollmentResponse -> "enrollmentresponse"
            EpisodeOfCare -> "episodeofcare"
            EventDefinition -> "eventdefinition"
            Evidence -> "evidence"
            EvidenceVariable -> "evidencevariable"
            ExampleScenario -> "examplescenario"
            ExplanationOfBenefit -> "explanationofbenefit"
            FamilyMemberHistory -> "familymemberhistory"
            Flag -> "flag"
            Goal -> "goal"
            GraphDefinition -> "graphdefinition"
            Group -> "group"
            GuidanceResponse -> "guidanceresponse"
            HealthcareService -> "healthcareservice"
            ImagingStudy -> "imagingstudy"
            Immunization -> "immunization"
            ImmunizationEvaluation -> "immunizationevaluation"
            ImmunizationRecommendation -> "immunizationrecommendation"
            ImplementationGuide -> "implementationguide"
            InsurancePlan -> "insuranceplan"
            Invoice -> "invoice"
            Library -> "library"
            Linkage -> "linkage"
            List -> "list"
            Location -> "location"
            Measure -> "measure"
            MeasureReport -> "measurereport"
            Media -> "media"
            Medication -> "medication"
            MedicationAdministration -> "medicationadministration"
            MedicationDispense -> "medicationdispense"
            MedicationKnowledge -> "medicationknowledge"
            MedicationRequest -> "medicationrequest"
            MedicationStatement -> "medicationstatement"
            MedicinalProduct -> "medicinalproduct"
            MedicinalProductAuthorization -> "medicinalproductauthorization"
            MedicinalProductContraindication -> "medicinalproductcontraindication"
            MedicinalProductIndication -> "medicinalproductindication"
            MedicinalProductIngredient -> "medicinalproductingredient"
            MedicinalProductInteraction -> "medicinalproductinteraction"
            MedicinalProductManufactured -> "medicinalproductmanufactured"
            MedicinalProductPackaged -> "medicinalproductpackaged"
            MedicinalProductPharmaceutical -> "medicinalproductpharmaceutical"
            MedicinalProductUndesirableEffect -> "medicinalproductundesirableeffect"
            MessageDefinition -> "messagedefinition"
            MessageHeader -> "messageheader"
            MolecularSequence -> "molecularsequence"
            NamingSystem -> "namingsystem"
            NutritionOrder -> "nutritionorder"
            Observation -> "observation"
            ObservationDefinition -> "observationdefinition"
            OperationDefinition -> "operationdefinition"
            OperationOutcome -> "operationoutcome"
            Organization -> "organization"
            OrganizationAffiliation -> "organizationaffiliation"
            Parameters -> "parameters"
            Patient -> "patient"
            PaymentNotice -> "paymentnotice"
            PaymentReconciliation -> "paymentreconciliation"
            Person -> "person"
            PlanDefinition -> "plandefinition"
            Practitioner -> "practitioner"
            PractitionerRole -> "practitionerrole"
            Procedure -> "procedure"
            Provenance -> "provenance"
            Questionnaire -> "questionnaire"
            QuestionnaireResponse -> "questionnaireresponse"
            RelatedPerson -> "relatedperson"
            RequestGroup -> "requestgroup"
            ResearchDefinition -> "researchdefinition"
            ResearchElementDefinition -> "researchelementdefinition"
            ResearchStudy -> "researchstudy"
            ResearchSubject -> "researchsubject"
            RiskAssessment -> "riskassessment"
            RiskEvidenceSynthesis -> "riskevidencesynthesis"
            Schedule -> "schedule"
            SearchParameter -> "searchparameter"
            ServiceRequest -> "servicerequest"
            Slot -> "slot"
            Specimen -> "specimen"
            SpecimenDefinition -> "specimendefinition"
            StructureDefinition -> "structuredefinition"
            StructureMap -> "structuremap"
            Subscription -> "subscription"
            Substance -> "substance"
            SubstanceNucleicAcid -> "substancenucleicacid"
            SubstancePolymer -> "substancepolymer"
            SubstanceProtein -> "substanceprotein"
            SubstanceReferenceInformation -> "substancereferenceinformation"
            SubstanceSourceMaterial -> "substancesourcematerial"
            SubstanceSpecification -> "substancespecification"
            SupplyDelivery -> "supplydelivery"
            SupplyRequest -> "supplyrequest"
            Task -> "task"
            TerminologyCapabilities -> "terminologycapabilities"
            TestReport -> "testreport"
            TestScript -> "testscript"
            ValueSet -> "valueset"
            VerificationResult -> "verificationresult"
            VisionPrescription -> "visionprescription"
        }


}