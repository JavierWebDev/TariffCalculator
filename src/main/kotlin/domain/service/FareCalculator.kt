package org.example.domain.service

import org.example.domain.model.Journey
import org.example.domain.model.PassangerType

interface FareCalculator {
    fun calculateFare (journey: Journey, passangerType: PassangerType) : Double
}