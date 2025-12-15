package net.perfect.tea.teapayments.pix.config

import io.github.cdimascio.dotenv.dotenv

class PixConfig {

    private val logger = KotlinLogging.logger {}

    val pixConf = teaPix()

    // To read the API Key of Open Pix
    val dotenv = dotenv()

    val pixStatus = (
            CONFIRMED,
            ERROR,
            NOT-CONFIRMED
            )
}