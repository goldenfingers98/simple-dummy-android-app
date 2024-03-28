plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "tn.ksoftwares.example.news.presentation"
    compileSdk = 34

    defaultConfig {
        minSdk = 28

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    implementation(project(":ui-kit"))


    implementation(PresentationDependencies.coil)

    // android core + compose
    implementation(PresentationDependencies.coreKtx)
    implementation(PresentationDependencies.lifecycleRuntime)
    implementation(PresentationDependencies.activityCompose)
    implementation(platform(PresentationDependencies.composeBom))
    implementation(PresentationDependencies.composeUi)
    implementation(PresentationDependencies.composeUiGraphics)
    implementation(PresentationDependencies.composeUiToolingPreview)
    implementation(PresentationDependencies.composeMaterial3)

    // dagger hilt
    implementation(PresentationDependencies.hiltAndroid)
    kapt(PresentationDependencies.hiltCompiler)
    kapt(PresentationDependencies.hiltAndroidCompiler)
    implementation(PresentationDependencies.hiltNavigationCompose)

    // test
    testImplementation(PresentationDependencies.junit4)
    androidTestImplementation(PresentationDependencies.androidJunitExt)
    androidTestImplementation(PresentationDependencies.composeJunit4)
    androidTestImplementation(PresentationDependencies.espresso)
    androidTestImplementation(platform(PresentationDependencies.composeBom))
    debugImplementation(PresentationDependencies.composeUiTooling)
    debugImplementation(PresentationDependencies.composeUiTestManifest)
}

kapt {
    correctErrorTypes = true
}