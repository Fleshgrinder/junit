@file:Suppress("UnstableApiUsage")

plugins {
    kotlin("jvm") version embeddedKotlinVersion
}

dependencies {
    api(libs.com.fasterxml.jackson.module.kotlin)
    api(libs.org.junit.jupiter.api)
}

java {
    withJavadocJar()
    withSourcesJar()
    consistentResolution {
        useCompileClasspathVersions()
    }
}

kotlin {
    explicitApi()
}
