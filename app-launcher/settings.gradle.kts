pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

val externalProjectsPaths = mapOf(
    "../domain/news-domain/" to listOf(
        "tn.ksoftwares.example:news-core" to ":core"
    ),
    "../infrastructure/news-infrastructure/" to listOf(
        "tn.ksoftwares.example:news-repository" to ":news-repository",
        "tn.ksoftwares.example:news-webclient" to ":news-webclient"
    ),
    "../presentation" to listOf(
        "tn.ksoftwares.example:news-presentation" to ":news-presentation",
        "tn.ksoftwares.example:ui-kit" to ":ui-kit"
    )
)

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    externalProjectsPaths.filter { File(it.key).exists() }
        .forEach {
            includeBuild(it.key) {
                dependencySubstitution {
                    it.value.forEach { sub ->
                        substitute(module(sub.first)).using(project(sub.second))
                    }
                }
            }
        }
}

rootProject.name = "NewsFeed"
include(":app")
 