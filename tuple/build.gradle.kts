plugins {
    kotlin("jvm") version embeddedKotlinVersion
}

dependencies {
    implementation(platform("io.arrow-kt:arrow-stack:1.1.2"))
    implementation("io.arrow-kt:arrow-core")
}

kotlin {
    explicitApi()
}
