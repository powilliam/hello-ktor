package com.powilliam.helloktor.routes

import com.powilliam.helloktor.models.Greetings
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.getGreetingsFromAuthor() {
    get(path = "/greetings") {
        val author = call.parameters["author"]?.capitalize() ?: "World"
        val message = "Hello, $author"
        call.respond(Greetings(message))
    }
}