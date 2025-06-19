plugins {
    // Android Application Plugin
    alias(libs.plugins.android.application)

    // Kotlin Plugin for Android
    alias(libs.plugins.kotlin.android)

    // KAPT for annotation processing (used by Room, Hilt)
    alias(libs.plugins.kotlin.kapt)

    // Jetpack Compose support
    alias(libs.plugins.kotlin.compose)

    // Hilt for Dependency Injection
    alias(libs.plugins.hilt)
}

// Required for KAPT to work properly
apply(plugin = "org.jetbrains.kotlin.kapt")

android {
    namespace = "com.rehan.jetpackcomposealldependencies"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.rehan.jetpackcomposealldependencies"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        // JUnit test runner
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            // ProGuard settings
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        // Java 11 compatibility
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        // Enables Jetpack Compose
        compose = true
    }
}

dependencies {
    // Core KTX extensions
    implementation(libs.androidx.core.ktx)

    // Lifecycle Runtime (observe lifecycle state in Kotlin)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // Activity Compose support
    implementation(libs.androidx.activity.compose)

    // Compose BOM (Bill of Materials to align Compose versions)
    implementation(platform(libs.androidx.compose.bom))

    // Jetpack Compose UI & Graphics
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)

    // Preview and Tooling support
    implementation(libs.androidx.ui.tooling.preview)
    debugImplementation(libs.androidx.ui.tooling)

    // Material 3 UI Components
    implementation(libs.androidx.material3)

    // JUnit for unit testing
    testImplementation(libs.junit)

    // AndroidX Test - JUnit & Espresso for UI testing
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Compose UI Testing
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Hilt for Dependency Injection
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.hilt.navigation.compose)

    // Accompanist Permissions (Compose)
    implementation(libs.accompanist.permissions)

    // Gson for JSON parsing
    implementation(libs.gson)

    // Room Database (Runtime, Kotlin Extensions, Compiler)
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    kapt(libs.room.compiler)

    // Retrofit & OkHttp for networking
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging.interceptor)

    // Kotlin Coroutines for async programming
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)

    // ViewModel, LiveData, StateFlow, Lifecycle runtime (including Compose support)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.runtime.compose)

    // Google Maps & Location Services
    implementation(libs.maps)
    implementation(libs.location)

    // WorkManager for background tasks
    implementation(libs.workManager)

    // Jetpack Navigation for Compose
    implementation(libs.navigation.compose)

    // Jetpack DataStore (SharedPreferences replacement)
    implementation(libs.datastore.preferences)

    // Coil for loading images in Compose
    implementation(libs.coil.compose)

    // ExoPlayer for video and audio playback
    implementation(libs.exoplayer.core)
    implementation(libs.exoplayer.ui)
}
