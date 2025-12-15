package net.perfect.tea.teapayments.config.flags.mercadopago

import kotlinx.serialization.Serializable

@Serializable
class MercadoPagoConfig(
    val tokenAcess: String,
    val callBack: String
)