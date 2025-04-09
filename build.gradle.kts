plugins {
    kotlin("jvm") version "2.1.10"
    id("org.jmailen.kotlinter") version "5.0.1"
}

group = "com.fugisawa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}