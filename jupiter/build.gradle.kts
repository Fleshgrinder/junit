@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version embeddedKotlinVersion
    `maven-publish`
}

dependencies {
    api(platform(project(":platform")))
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

val pkg = objects.property<String>().apply {
    set(provider { "${project.group}.${project.name}" })
    disallowUnsafeRead()
    finalizeValueOnRead()
}

val dir = pkg.map {
    project.file("src/main/kotlin/${it.replace('.', '/')}")
}

tasks {
    val generateTestCaseSymbols by registering {
        val arity = 32
        inputs.property("arity", arity)
        inputs.property("pkg", pkg)
        inputs.property("dir", dir)
        val outFile = dir.map { it.resolve("TestCase.kt") }
        outputs.file(outFile)
        outputs.cacheIf { false }
        doLast {
            val pkg = pkg.get()
            outFile.get().bufferedWriter().use { out ->
                out.apply {
                    appendLine("@file:Suppress(\"NOTHING_TO_INLINE\")")
                    appendLine()
                    append("package ").appendLine(pkg)
                    appendLine()
                    appendLine("public sealed class TestCase {")
                    appendLine("    public abstract val name: String?")
                    appendLine("    public companion object")
                    appendLine('}')
                    appendLine()

                    for (i in 1..arity) {
                        if (i != 1) appendLine()
                        val iS = i.toString()

                        val args = (1..i).joinToString(", ") { "p$it" }
                        val params4 = buildString {
                            for (j in 1..i) {
                                val jS = j.toString()
                                append("    p").append(jS).append(": P").append(jS).append(",\n")
                            }
                        }
                        val params8 = buildString {
                            for (j in 1..i) {
                                val jS = j.toString()
                                append("        p").append(jS).append(": P").append(jS).append(",\n")
                            }
                        }
                        val paramTypes = (1..i).joinToString(", ", "<", ">") { "P$it" }
                        val assignments = buildString {
                            for (j in 1..i) {
                                val jS = j.toString()
                                append("        this.p").append(jS).append(" = p").appendLine(jS)
                            }
                        }

                        appendLine("/** @see TestCase */")
                        append("public class TestCase").append(iS).append(paramTypes).appendLine(" : TestCase {")
                        for (j in 1..i) {
                            val jS = j.toString()
                            append("    @JvmField public val p").append(jS).append(": P").appendLine(jS)
                        }
                        appendLine("    override val name: String?")
                        appendLine()

                        appendLine("    @PublishedApi internal constructor(")
                        append(params8)
                        appendLine("        name: String? = null,")
                        appendLine("    ) : super() {")
                        append(assignments)
                        appendLine("        this.name = name")
                        appendLine("    }")
                        appendLine()

                        appendLine("    @PublishedApi internal constructor(")
                        append(params8)
                        append("        name: (TestCase").append(iS).append(paramTypes).appendLine(") -> String,")
                        appendLine("    ) : super() {")
                        append(assignments)
                        appendLine("        this.name = name(this)")
                        appendLine("    }")
                        appendLine()

                        appendLine("    override fun toString(): String =")
                        append("        name ?: \"")
                        for (j in 1..i) {
                            val jS = j.toString()
                            if (j != 1) append(", ")
                            append("\$p").append(jS)
                        }
                        appendLine("\"")
                        appendLine()
                        run {
                            var j = 1
                            do {
                                val jS = j.toString()
                                append("    public operator fun component")
                                append(jS)
                                append("(): P")
                                append(jS)
                                append(" = p")
                                appendLine(jS)
                            } while (j++ < i)
                            append("    public operator fun component").append(j.toString()).appendLine("(): String? = name")
                        }
                        appendLine('}')
                        appendLine()

                        appendLine("/** @see TestCase */")
                        append("public inline fun ").append(paramTypes).appendLine(" case(")
                        append(params4)
                        append("): TestCase").append(iS).append(paramTypes).appendLine(" =")
                        append("    TestCase").append(iS).append('(').append(args).appendLine(", null)")
                        appendLine()

                        appendLine("/** @see TestCase */")
                        append("public inline fun ").append(paramTypes).appendLine(" case(")
                        append(params4)
                        append("    noinline name: (TestCase").append(iS).append(paramTypes).appendLine(") -> String,")
                        append("): TestCase").append(iS).append(paramTypes).appendLine(" =")
                        append("    TestCase").append(iS).append('(').append(args).appendLine(", name)")
                        appendLine()

                        appendLine("/** @see TestCase */")
                        append("public inline ")
                        if (i == 1) append("infix ")
                        append("fun ").append(paramTypes).appendLine(" String.case(")
                        append(params4)
                        append("): TestCase").append(iS).append(paramTypes).appendLine(" =")
                        append("    TestCase").append(iS).append('(').append(args).appendLine(", this)")
                    }
                }
            }
        }
    }

    compileKotlin {
        dependsOn(generateTestCaseSymbols)
    }

    withType<KotlinCompile>().configureEach {
        kotlinOptions {
            allWarningsAsErrors = true
        }
    }
}
