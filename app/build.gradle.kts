import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
    id("org.springframework.boot") version "2.3.5.RELEASE"
}
apply(plugin = "io.spring.dependency-management")

group = "org.itmodreamteam.myrest"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation(kotlin("test-junit"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}
application {
    mainClassName = "org.itmodreamteam.myrest.server.MainKt"
}
