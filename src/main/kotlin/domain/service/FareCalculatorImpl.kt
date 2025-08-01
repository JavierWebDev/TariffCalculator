package org.example.domain.service

import org.example.domain.model.Journey
import org.example.domain.model.PassangerType

class FareCalculatorApp : FareCalculator{
    override fun calculateFare(journey: Journey, passangerType: PassangerType) : Double {
        val baseFare = 10.0

        return when (passangerType.passangerType.lowercase()) {
            "adult" -> baseFare
            "senior" -> baseFare * 0.7
            "kid" -> baseFare * 0.5
            else -> baseFare
        }
    }
}