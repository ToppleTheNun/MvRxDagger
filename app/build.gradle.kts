import com.android.build.gradle.AppExtension

plugins {
    id("com.android.application") version "3.4.0-alpha01"
    id("kotlin-android") version embeddedKotlinVersion
    id("kotlin-android-extensions") version embeddedKotlinVersion
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.richardharrah.mvrxdagger"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        findByName("release")?.apply {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$embeddedKotlinVersion")
    implementation("androidx.appcompat:appcompat:1.0.0")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.0-beta02")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-beta02")
}
