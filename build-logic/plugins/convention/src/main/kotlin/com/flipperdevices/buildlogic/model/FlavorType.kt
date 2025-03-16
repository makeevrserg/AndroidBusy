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
    val isSensitiveLogEnabled: Boolean,
    val isGoogleFeatureAvaliable: Boolean
) {
    DEV(
        isLogEnabled = true,
        crashAppOnFailedChecks = true,
        isSentryEnabled = true,
        isSentryPublishMappingsEnabled = false,
        isSensitiveLogEnabled = true,
        isGoogleFeatureAvaliable = true
    ),
    PROD_GP( // For Google Play
        isLogEnabled = true,
        crashAppOnFailedChecks = false,
        isSentryEnabled = true,
        isSentryPublishMappingsEnabled = true,
        isSensitiveLogEnabled = false,
        isGoogleFeatureAvaliable = true
    ),
    PROD_GH_GMS( // For GitHub, with google services
        isLogEnabled = true,
        crashAppOnFailedChecks = false,
        isSentryEnabled = true,
        isSentryPublishMappingsEnabled = true,
        isSensitiveLogEnabled = false,
        isGoogleFeatureAvaliable = true
    ),
    PROD_GH_NOGMS( // For GitHub, without google services
        isLogEnabled = true,
        crashAppOnFailedChecks = false,
        isSentryEnabled = true,
        isSentryPublishMappingsEnabled = true,
        isSensitiveLogEnabled = false,
        isGoogleFeatureAvaliable = false
    )
}
