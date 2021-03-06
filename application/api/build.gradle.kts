val ktor_version: String by project
val logback_version: String by project

plugins {
    application
}

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
    maven { url = uri("https://kotlin.bintray.com/ktor") }
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("io.ktor:ktor-jackson:$ktor_version")

    implementation("ch.qos.logback:logback-classic:$logback_version")

    testImplementation("io.ktor:ktor-server-tests:$ktor_version")

    implementation(project(":module:gradle-property"))
}
