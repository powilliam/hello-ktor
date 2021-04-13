package com.powilliam.helloktor.modules

import com.powilliam.helloktor.routes.getGreetingsFromAuthor
import io.ktor.application.*
import io.ktor.routing.*

fun Application.greetingsModule() {
    routing {
        getGreetingsFromAuthor()
    }
}