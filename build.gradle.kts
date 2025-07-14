plugins {
    kotlin("jvm") version "2.2.0"
}

group = "io.github.stream29"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}