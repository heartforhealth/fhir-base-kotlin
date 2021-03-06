package io.h4h.fhir.r4.base

import kotlinx.serialization.Serializable


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
// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1


/**
 * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
 */
@Serializable
data class Identifier @JvmOverloads constructor(

    /**
     * The purpose of this identifier.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/identifier-use")
     */
    val use: IdentifierUse? = null,

    /**
     * A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/identifier-type")
     */
    val type: CodeableConcept? = null,

    /**
     * Establishes the namespace for the value - that is, a URL that describes a set values that are unique.
     */
    val system: String? = null,

    /**
     * The portion of the identifier typically relevant to the user and which is unique within the context of the system.
     */
    val value: String? = null,

    /**
     * Time period during which identifier is/was valid for use.
     */
    val period: Period? = null,

    /**
     * Organization that issued/manages the identifier.
     */
    val assigner: Reference? = null

) {

    /// most used constructor
    constructor(value: String) : this(null, null, null, value, null, null)
    /// most used constructor
    constructor(value: String, system: String) : this(null, null, system, value, null, null)
}