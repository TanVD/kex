import tanvd.kosogor.proxy.publishJar

group = "tanvd.kex"
version = "0.1.1"

plugins {
    id("tanvd.kosogor") version "1.0.6" apply true
    kotlin("jvm") version "1.3.31" apply true
}

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib"))
}

publishJar {
    bintray {
        username = "tanvd"
        repository = "tanvd.kex"
        info {
            description = "Kotlin EXtended library"
            githubRepo = "https://github.com/TanVD/kex"
            vcsUrl = "https://github.com/TanVD/kex"
            labels.addAll(listOf("kotlin", "utils", "extensions", "dsl"))
        }
    }
}

