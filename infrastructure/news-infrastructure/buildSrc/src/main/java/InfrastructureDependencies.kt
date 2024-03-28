object InfrastructureDependencies {

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${InfrastructureVersions.HILT}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${InfrastructureVersions.HILT}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${InfrastructureVersions.HILT_COMPILER}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${InfrastructureVersions.RETROFIT}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${InfrastructureVersions.OKHTTP}" }
    val gsonConventer by lazy { "com.squareup.retrofit2:converter-gson:${InfrastructureVersions.GSON_CONVERTER}" }
    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${InfrastructureVersions.MOSHI}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${InfrastructureVersions.MOSHI_CONVERTER}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${InfrastructureVersions.LOGGING_INTERCEPTOR}" }

    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${InfrastructureVersions.COROUTINES}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${InfrastructureVersions.COROUTINES}" }

}