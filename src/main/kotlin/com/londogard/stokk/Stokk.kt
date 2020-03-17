package com.londogard.stokk

import kotlin.math.pow

object Stokk {
    fun compoundInterest(years: Int, startAmount: Double, interest: Double, monthlyDeposit: Int): Double =
        (0 until years*12).fold(startAmount) { acc, _ -> (acc + monthlyDeposit) * interest.pow(1.0/12) }

    fun compoundInterestMonthByMonth(years: Int, startAmount: Double, interest: Double, monthlyDeposit: Int): List<Double> =
        (0 until years*12).fold(listOf(startAmount)) { acc, index -> acc + (acc[index] + monthlyDeposit) * interest.pow(1.0/12) }
}