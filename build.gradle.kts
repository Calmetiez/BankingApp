buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.3.0")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.safeArgs) apply false
}

