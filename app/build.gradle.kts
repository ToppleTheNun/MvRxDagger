import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(28)
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
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
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Kotlin
    implementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))
    implementation(kotlin("reflect", KotlinCompilerVersion.VERSION))

    // AndroidX
    implementation("androidx.core:core-ktx:1.0.0")
    implementation("androidx.fragment:fragment-ktx:1.0.0")
    implementation("androidx.appcompat:appcompat:1.0.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")

    // Material
    implementation("com.google.android.material:material:1.0.0")

    // MvRx
    implementation("com.airbnb.android:mvrx:0.5.0")

    // Dagger
    implementation("com.google.dagger:dagger:2.16")
    kapt("com.google.dagger:dagger-compiler:2.16")

    // OkHttp3
    implementation("com.squareup.okhttp3:logging-interceptor:3.11.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.4.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.4.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.4.0")

    // Moshi
    implementation("com.squareup.moshi:moshi:1.7.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.7.0")
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.7.0")

    // Timber
    implementation("com.jakewharton.timber:timber:4.7.1")

    // Testing
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.0-beta02")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-beta02")
}
