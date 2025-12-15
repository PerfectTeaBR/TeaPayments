package net.perfect.tea.teapayments.launcher

import com.mercadopago.sdk.android.initializer
import net.perfect.tea.teapayments.launcher.utils
import net.perfect.tea.teapayments.checkFile
import java.io.file

fun main() {
    // HarmonyLogging - PerfectDreams https://github.com/PerfectDreams/HarmonyLogging - Credits to PerfectDreams
    private val logger = KotlinLogging.logger {}

    MercadoPagoSDK.initialize(
        context = this,
        publicKey = BuildConfig.PUBLIC_KEY,
        countryCode = // use the country code for that public key,
    )

    val mercadoPagoflagFile = teaCheckFile("/configflags/MercadoPagoConfig.kt")
    val pixFlagFile = teaCheckFile("/configflags/PixConfig.kt")
}