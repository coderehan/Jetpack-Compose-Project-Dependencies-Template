// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Android Application Plugin
    alias(libs.plugins.android.application) apply false

    // Kotlin Plugin for Android
    alias(libs.plugins.kotlin.android) apply false

    // Kotlin Compose Plugin
    alias(libs.plugins.kotlin.compose) apply false

    // Kotlin KAPT (Kotlin Annotation Processing Tool) for Dagger, Room, etc.
    alias(libs.plugins.kotlin.kapt) apply false

    // Hilt Dependency Plugin
    alias(libs.plugins.hilt) apply false
}
