plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "tn.ksoftwares.example.news"
    compileSdk = 34

    defaultConfig {
        applicationId = "tn.ksoftwares.example.news"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation("tn.ksoftwares.example:news-core:1.0.0")
    implementation("tn.ksoftwares.example:news-repository:1.0.0")
    implementation("tn.ksoftwares.example:news-webclient:1.0.0")
    implementation("tn.ksoftwares.example:ui-kit:1.0.0")
    implementation("tn.ksoftwares.example:news-presentation:1.0.0")

    // android core + compose
    implementation(AppDependencies.coreKtx)
    implementation(AppDependencies.lifecycleRuntime)
    implementation(AppDependencies.activityCompose)
    implementation(platform(AppDependencies.composeBom))
    implementation(AppDependencies.composeUi)
    implementation(AppDependencies.composeUiGraphics)
    implementation(AppDependencies.composeUiToolingPreview)
    implementation(AppDependencies.composeMaterial3)

    // dagger hilt
    implementation(AppDependencies.hiltAndroid)
    kapt(AppDependencies.hiltCompiler)
    kapt(AppDependencies.hiltAndroidCompiler)
    implementation(AppDependencies.hiltNavigationCompose)

    // coroutines
    implementation(AppDependencies.coroutinesCore)
    implementation(AppDependencies.coroutinesAndroid)

    // splash screen
    implementation(AppDependencies.splashScreen)

    // Junit4
    testImplementation(AppDependencies.junit4)
    androidTestImplementation(AppDependencies.androidJunitExt)
    androidTestImplementation(AppDependencies.composeJunit4)

    androidTestImplementation(AppDependencies.espresso)
    androidTestImplementation(platform(AppDependencies.composeBom))
    debugImplementation(AppDependencies.composeUiTooling)
    debugImplementation(AppDependencies.composeUiTestManifest)
}

kapt {
    correctErrorTypes = true
}