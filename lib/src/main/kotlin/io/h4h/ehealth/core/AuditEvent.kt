package io.h4h.ehealth.core

import io.h4h.ehealth.currentDateIsoString
import io.h4h.fhir.r4.base.Reference
import kotlinx.serialization.Serializable


@Serializable
data class AuditEvent @JvmOverloads constructor(

    /**
     * The type of the event. Values are defined at higher-level.
     */
    val name: String? = null,


    /**
     * The type of the event. Values are defined at higher-level.
     */
    val type: AuditEventType? = null,


    /**
     * Reference to author. e.g. Patient, Practitioner, ...
     */
    val author: Reference? = null,


    /**
     * ISO8601 dateTime, UTC
     */
    val dateTime: String = currentDateIsoString(),


    /**
     * Reference to a Resource (e.g. Program/Device/Appointment/Encounter), when applicable
     */
    val context: Reference? = null,


)


/// ==============================================================
/// AuditEventType
/// ==============================================================


/**
 * Enum defining the most important types of events that are being audited
 */
@Serializable
enum class AuditEventType {
    Created, Modified, Deleted, Forwarded
}