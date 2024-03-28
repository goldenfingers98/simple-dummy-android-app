object PresentationDependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${PresentationVersions.CORE_KTX}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${PresentationVersions.LIFECYCLE_RUNTIME}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${PresentationVersions.ACTIVITY_COMPOSE}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${PresentationVersions.COMPOSE_BOM}" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3" }
    val junit4 by lazy { "junit:junit:${PresentationVersions.JUNIT4}" }
    val androidJunitExt by lazy { "androidx.test.ext:junit:${PresentationVersions.ANDROID_JUNIT_EXT}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${PresentationVersions.ESPRESSO}" }
    val composeJunit4 by lazy { "androidx.compose.ui:ui-test-junit4" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val composeUiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${PresentationVersions.HILT}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${PresentationVersions.HILT}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${PresentationVersions.HILT_COMPILER}" }
    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${PresentationVersions.HILT_NAVIGATION}" }

    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${PresentationVersions.COROUTINES}" }

    val coil by lazy { "io.coil-kt:coil-compose:${PresentationVersions.COIL}" }


}