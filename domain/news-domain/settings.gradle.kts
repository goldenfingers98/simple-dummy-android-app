rootProject.name = "news-domain"
include("core")
include("model")


pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenLocal()
    }

    listOf("../../plugins").filter { File(it).exists() }
        .forEach {
            includeBuild(it)
        }
}