plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("tn.ksoftwares.hexagonal.kotlin-library") version "1.0.0"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

publishing {
    publications {
        named<MavenPublication>("mavenJava") {
            artifactId = "news-core"
        }
    }
}

dependencies {
    api(project(":model"))
    implementation(DomainDependencies.coroutinesCore)
}
