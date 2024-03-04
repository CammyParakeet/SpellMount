plugins {
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.serialization") version "1.9.0"
    id("io.papermc.paperweight.userdev") version "1.5.11"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    application
}

group = "com.parakeetstudios"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    paperweight.paperDevBundle("1.20.4-R0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
    implementation("io.insert-koin:koin-core:3.5.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
}

tasks {
    assemble {
        dependsOn(reobfJar)
    }
}


tasks.shadowJar {
    archiveBaseName.set("SpellMount")
    archiveVersion.set("1.0.0")
    archiveClassifier.set("")
    manifest {
        attributes("mainClassName" to "com.parakeetstudios.spellmount.MountPlugin")
    }
}


kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.parakeetstudios.spellmount.MountPlugin")
}