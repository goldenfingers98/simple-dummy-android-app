plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "tn.ksoftwares.example.news.webclient"
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
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":news-repository"))
    implementation("tn.ksoftwares.example:news-core:1.0.0")

    implementation(InfrastructureDependencies.okhttp)
    implementation(InfrastructureDependencies.retrofit)
    implementation(InfrastructureDependencies.moshiConverter)
    implementation(InfrastructureDependencies.moshi)
    implementation(InfrastructureDependencies.loggingInterceptor)
    implementation(InfrastructureDependencies.gsonConventer)

    implementation(InfrastructureDependencies.hiltAndroid)
    kapt(InfrastructureDependencies.hiltCompiler)
    kapt(InfrastructureDependencies.hiltAndroidCompiler)

    implementation(InfrastructureDependencies.coroutinesAndroid)


    testImplementation("junit:junit:4.13.2")
}

kapt {
    correctErrorTypes = true
}