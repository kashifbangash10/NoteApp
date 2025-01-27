import com.android.build.api.dsl.ViewBinding

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
 //   id("com.google.devtools.ksp")
}


android {
    namespace = "com.example.noteappwithmvvm"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.noteappwithmvvm"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    viewBinding {
        enable=true
    }



}


dependencies {
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
//    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
//    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
//    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7")
//    implementation ("androidx.room:room-runtime:2.6.1")
//

//    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.30")
//
//    annotationProcessor ("androidx.room:room-compiler:2.6.1")
//    implementation ("androidx.room:room-ktx:2.6.1")
    dependencies {
        implementation ("androidx.room:room-runtime:2.5.0")
    //    kapt( "androidx.room:room-compiler:2.5.0")
        implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.0")
        implementation( "androidx.lifecycle:lifecycle-livedata-ktx:2.6.0")
        implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    }

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    val  nav_version = "2.8.5"

    // Views/Fragments Integration
    implementation ("com.google.android.material:material:1.9.0")

    implementation ("androidx.navigation:navigation-fragment:$nav_version")
    implementation ("androidx.navigation:navigation-ui:$nav_version")

}