package net.perfect.tea.teapayments

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import net.perfect.tea.teapayments.ConfigFile
import net.perfect.tea.teapayments.gateway

class CakePayments {
    val config = conf("TeaPayments.conf")

    val paymentFlags = (
            Gateway.MERCADOPAGO to MercadoPagoPaymentCreator(this)
            Gateway.PIX to PixPaymenteCreator(this)
            )
}