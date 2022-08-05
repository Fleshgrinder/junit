plugins {
    `java-platform`
    `maven-publish`
}

dependencies {
    constraints {
        api(project(":jupiter"))
        api(project(":jupiter:dynamic-test"))
        api(project(":jupiter:jackson"))
        api(project(":jupiter:jackson:json"))
        api(project(":jupiter:jackson:toml"))
        api(project(":jupiter:jackson:yaml"))
    }
}
