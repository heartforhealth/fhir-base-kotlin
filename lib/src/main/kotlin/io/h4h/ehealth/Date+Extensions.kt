@file:JvmName("DateExtensions")

package io.h4h.ehealth


import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter


/**
 * create String from Date
 * @return ISO8601 string
 */
fun currentDateIsoString(): String {
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneOffset.UTC)
    return ZonedDateTime.now().format(formatter)
}

