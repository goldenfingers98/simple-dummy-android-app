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

rootProject.name = "presentation"
include(":news-presentation")
include(":ui-kit")
