plugins {
    alias(Melibs.plugins.kotlin.jvm)
    alias(libs.plugins.ktor)
}

group = "net.perfect.tea.teapayments"
version = "0.0.1"

application {
    mainClass = "io.ktor.server.netty.EngineMain"
}

dependencies {
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    implementation(libs.logback.classic)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.config.yaml)
    testImplementation(libs.ktor.server.test.host)
    testImplementation(libs.kotlin.test.junit)

    // PerfectTea Implementations
    implementation('net.perfect.tea.teapayments.launcher')
    implementation('net.perfect.tea.teapayments.utils')
    implementation('net.perfect.tea.teapayments.checkFile')

    // MercadoPago Implementations
    implementation('com.mercadopago.sdk.android')

    // Dotenv Implementations
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.1")
}
