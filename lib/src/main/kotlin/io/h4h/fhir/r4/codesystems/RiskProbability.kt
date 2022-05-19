package io.h4h.fhir.r4.codesystems

import io.h4h.fhir.r4.base.CodeableEnumeration
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



@Serializable
enum class RiskProbability : CodeableEnumeration {

    /**
     * The specified outcome is exceptionally unlikely.
     */
    negligible,

    /**
     * The specified outcome is possible but unlikely.
     */
    low,

    /**
     * The specified outcome has a reasonable likelihood of occurrence.
     */
    moderate,

    /**
     * The specified outcome is more likely to occur than not.
     */
    high,

    /**
     * The specified outcome is effectively guaranteed.
     */
    certain;


    override val code = name

    override val system = "http://terminology.hl7.org/CodeSystem/risk-probability"

    override val definition: String
        get() = when (this) {
            negligible -> "The specified outcome is exceptionally unlikely."
            low -> "The specified outcome is possible but unlikely."
            moderate -> "The specified outcome has a reasonable likelihood of occurrence."
            high -> "The specified outcome is more likely to occur than not."
            certain -> "The specified outcome is effectively guaranteed."
        }

    override val display: String
        get() = when (this) {
            negligible -> "Negligible likelihood"
            low -> "Low likelihood"
            moderate -> "Moderate likelihood"
            high -> "High likelihood"
            certain -> "Certain"
        }

}