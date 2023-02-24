plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":demo:common"))
    implementation("androidx.activity:activity-compose:1.6.1")
}

android {
    compileSdk = 33
    defaultConfig {
        applicationId = "com.wakaztahir.android"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}