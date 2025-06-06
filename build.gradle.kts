buildscript {
    repositories {
        jcenter()
        google()
        maven { url = uri("https://www.jitpack.io" ) }
    }
    dependencies {
        classpath("com.google.gms:google-services:4.4.1")
    }
}


// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

