import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.0"
    kotlin("plugin.spring") version "1.6.0"
}

repositories { mavenCentral() }

dependencies { implementation("org.springframework.boot:spring-boot-starter-web") }

tasks.withType<KotlinCompile> { kotlinOptions {} }
