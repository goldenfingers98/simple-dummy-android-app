object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.CORE_KTX}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_RUNTIME}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.COMPOSE_BOM}" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3" }
    val junit4 by lazy { "junit:junit:${Versions.JUNIT4}" }
    val androidJunitExt by lazy { "androidx.test.ext:junit:${Versions.ANDROID_JUNIT_EXT}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}" }
    val composeJunit4 by lazy { "androidx.compose.ui:ui-test-junit4" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val composeUiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.HILT}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.HILT}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.HILT_COMPILER}" }
    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.HILT_NAVIGATION}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}" }
    val gsonConventer by lazy { "com.squareup.retrofit2:converter-gson:${Versions.GSON_CONVERTER}" }
    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.MOSHI_CONVERTER}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING_INTERCEPTOR}" }

    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}" }

    val splashScreen by lazy { "androidx.core:core-splashscreen:${Versions.SPLASH_SCREEN}" }

    val coil by lazy { "io.coil-kt:coil-compose:${Versions.COIL}" }


}