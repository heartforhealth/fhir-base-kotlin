package io.h4h.fhir.r4.base

import io.h4h.fhir.r4.serializers.InstantSerializer
import kotlinx.datetime.Instant
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
 * A time period defined by a start and end date and optionally time.
 */


@Serializable
data class Period(

    /**
     * The start of the period. The boundary is inclusive.
     *  	A date, date-time or partial date (e.g. just year or year + month) as used in human communication. The format is YYYY, YYYY-MM, YYYY-MM-DD or YYYY-MM-DDThh:mm:ss+zz:zz, e.g. 2018, 1973-06, 1905-08-23, 2015-02-07T13:28:17-05:00 or 2017-01-01T00:00:00.000Z.
     */
    @Serializable(with= InstantSerializer::class)
    val start: Instant? = null,

    /**
     * The end of the period. If the end of the period is missing, it means no end was known or planned at the time the instance was created. The start may be in the past, and the end date in the future, which means that period is expected/planned to end at that time.
     *  	A date, date-time or partial date (e.g. just year or year + month) as used in human communication. The format is YYYY, YYYY-MM, YYYY-MM-DD or YYYY-MM-DDThh:mm:ss+zz:zz, e.g. 2018, 1973-06, 1905-08-23, 2015-02-07T13:28:17-05:00 or 2017-01-01T00:00:00.000Z.
     */
    @Serializable(with= InstantSerializer::class)
    val end: Instant? = null
)