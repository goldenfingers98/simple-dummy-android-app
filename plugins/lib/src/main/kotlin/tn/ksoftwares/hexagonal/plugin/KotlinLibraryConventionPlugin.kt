package tn.ksoftwares.hexagonal.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinLibraryConventionPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // Apply the common convention plugin for shared build configuration between library and application projects.
        project.plugins.apply("tn.ksoftwares.hexagonal.common")
        // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
        project.pluginManager.apply("org.jetbrains.kotlin.jvm")
        // Apply the java-library plugin for API and implementation separation.
        project.plugins.apply("java-library")
    }
}