package org.example

import org.example.domain.model.Journey
import org.example.domain.model.PassangerType
import org.example.domain.service.FareCalculatorApp

fun main() {
    var isActive = true
    do {
        var journey = defineJourney()
        var passangerType = definePassanger()

        var fc = FareCalculatorApp()

        var finalFare = fc.calculateFare(journey, passangerType)

        println("[*] FINAL FARE: $finalFare")

        println("[?] Calculate another fare? y/n")
        var opc = readln()
        when (opc) {
            "y" -> isActive = true
            "n" -> isActive = false
            else -> isActive = false
        }



    } while (isActive == true)
}

fun defineJourney() : Journey {
    println("[?] Origin: ")
    var origin = readln()

    println("[?] Destination:")
    var destination = readln()

    return Journey(origin, destination)
}

fun definePassanger() : PassangerType {
    println("[?] Rider Type: (Adult, Senior, Kid)")
    var passangerType = readln()

    return PassangerType(passangerType)
}