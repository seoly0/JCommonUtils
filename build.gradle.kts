plugins {
    kotlin("jvm") version "1.9.22"
}

group = "me.seoly.utils"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}