plugins {
    kotlin("jvm") version embeddedKotlinVersion
}

dependencies {
    // TODO use plugin in examples to showcase how it results in zero config
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation(project(":jupiter"))
    testImplementation("io.strikt:strikt-jvm:0.31.0")
}

tasks.test {
    useJUnitPlatform()
}
