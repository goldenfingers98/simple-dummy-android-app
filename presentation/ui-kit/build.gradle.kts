plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "tn.ksoftwares.example.uikit"
    compileSdk = 34

    defaultConfig {
        minSdk = 28

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    implementation(PresentationDependencies.coreKtx)
    implementation(PresentationDependencies.lifecycleRuntime)
    implementation(PresentationDependencies.activityCompose)
    implementation(platform(PresentationDependencies.composeBom))
    implementation(PresentationDependencies.composeUi)
    implementation(PresentationDependencies.composeUiGraphics)
    implementation(PresentationDependencies.composeUiToolingPreview)
    implementation(PresentationDependencies.composeMaterial3)


    // Junit4
    testImplementation(PresentationDependencies.junit4)
    androidTestImplementation(PresentationDependencies.androidJunitExt)
    androidTestImplementation(PresentationDependencies.composeJunit4)

    androidTestImplementation(PresentationDependencies.espresso)
    androidTestImplementation(platform(PresentationDependencies.composeBom))
    debugImplementation(PresentationDependencies.composeUiTooling)
    debugImplementation(PresentationDependencies.composeUiTestManifest)
}