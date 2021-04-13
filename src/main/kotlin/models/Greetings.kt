package com.powilliam.helloktor.models

import kotlinx.serialization.Serializable

@Serializable
data class Greetings(val message: String)