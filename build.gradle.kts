buildscript {
    repositories {
        google()
    }
    dependencies {
        val navVersion = "2.7.3"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.8.5")
//        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.52")
        classpath ("com.android.tools.build:gradle:7.0.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")
      //  classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")



    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
        // id("com.android.application") version "8.2.2" apply false
 //   id("org.jetbrains.kotlin.android") version "1.9.24" apply false
   // id("androidx.navigation.safeargs.kotlin") version "2.8.5"
}