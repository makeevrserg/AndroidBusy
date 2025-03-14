package com.flipperdevices.buildlogic.model

/**
 * This enum is used to define new kotlin-generated BuildKonfig
 *
 * We already have multiple flavors for android - debug, internal, release
 * but android's flavor BuildConfig generation isn't compatible with KMP,
 * so in the end, when project will e KMP-full, this will be final version
 * of BuildKonfig field values
 */
enum class FlavorType(
    val isLogEnabled: Boolean,
    val crashAppOnFailedChecks: Boolean,
    val isSentryEnabled: Boolean,
    val isSentryPublishMappingsEnabled: Boolean,
    val isSensitiveLogEnabled: Boolean
) {
    DEV(
        isLogEnabled = true,
        crashAppOnFailedChecks = true,
        isSentryEnabled = true,
        isSentryPublishMappingsEnabled = false,
        isSensitiveLogEnabled = true
    ),
    PROD(
        isLogEnabled = true,
        crashAppOnFailedChecks = false,
        isSentryEnabled = true,
        isSentryPublishMappingsEnabled = true,
        isSensitiveLogEnabled = false
    )
}
