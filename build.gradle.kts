plugins {
    id("com.android.application") version "8.1.1"
    id("org.jetbrains.kotlin.android") version "1.9.0"
}

android {
    namespace = "app.sensicoach"
    compileSdk = 34

    defaultConfig {
        applicationId = "app.sensicoach"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}
