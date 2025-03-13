plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    id("flipper.android-app")
    id("flipper.multiplatform-dependencies")
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
}

android.namespace = "com.flipperdevices.bsbtest"

kotlin {
    androidTarget()
}

commonDependencies {
    implementation(kotlin.compose.runtime)
}
