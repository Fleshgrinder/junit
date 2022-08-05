@file:Suppress("UnstableApiUsage")

plugins {
    kotlin("jvm") version embeddedKotlinVersion
}

dependencies {
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
