package com.londogard.stokk

import kotlin.math.pow

object Stokk {
    fun compoundInterest(years: Int, startAmount: Double, interest: Double, monthlyDeposit: Int): Double =
        (0 until years*12).fold(startAmount) { acc, _ -> (acc + monthlyDeposit) * interest.pow(1.0/12) }
}

