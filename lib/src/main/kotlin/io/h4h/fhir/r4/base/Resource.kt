package io.h4h.fhir.r4.base



interface Resource {

    /**
     * The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
     */
    val id: String

    /**
     * Resource type
     */
    val resourceType: ResourceType

    /**
     * The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
     */
    val meta: Meta?

    /**
     * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
     */
    val implicitRules: String?

    /**
     * The base language in which the resource is written.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/languages")
     */
    val language: String?


}