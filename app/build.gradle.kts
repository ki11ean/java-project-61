plugins {
    application
    checkstyle
    id("jacoco")
    id("se.patrikerdes.use-latest-versions") version "0.2.18"
    id("com.github.ben-manes.versions") version "0.41.0"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass = "hexlet.code.App"
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(20)
}
