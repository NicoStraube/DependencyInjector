import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    alias(libs.plugins.kotlin.jvm) // id("org.jetbrains.kotlin.jvm") version "1.8.20"
    alias(libs.plugins.shadow) // id("com.github.johnrengelman.shadow") version "7.1.2"
    alias(libs.plugins.kotlin.plugin.serialization) // id("org.jetbrains.kotlin.plugin.serialization") version "1.8.20"
}

version = "1.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly(libs.paper.api) // implementation(group = "io.papermc.paper", name = "paper-api", version = "1.19.4-R0.1-SNAPSHOT")

    implementation(libs.bundles.kotlin)
}

tasks.withType<ShadowJar> {
    archiveBaseName.set("DependencyInjector")
    archiveVersion.set(version.toString())

    dependencies {
        exclude(dependency("io.papermc.paper:paper-api:.*"))
    }

    doLast {
        copy {
            // println("${archiveBaseName.get()}-${archiveVersion.get()}-all.jar")
            from("build/libs/${archiveBaseName.get()}-${archiveVersion.get()}-all.jar")
            into("../../plugins/")
        }
    }
}
