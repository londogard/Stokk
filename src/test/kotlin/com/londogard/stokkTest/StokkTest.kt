package com.londogard.stokkTest

import com.londogard.stokk.Stokk
import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test
import kotlin.math.roundToInt


class StokkTest {
    @Test
    fun `no saving time should equal startAmount`() {
        Stokk.compoundInterest(0, 100.0, 1.0, 0) shouldBeEqualTo 100.0
    }

    @Test
    fun `one year with monthly deposits`() {
        Stokk.compoundInterest(1, 100.0, 1.0, 10) shouldBeEqualTo 220.0
    }

    @Test
    fun `two year with monthly deposits`() {
        Stokk.compoundInterest(2, 100.0, 1.0, -10) shouldBeEqualTo -140.0
    }

    @Test
    fun `avanza test`() {
        Stokk.compoundInterest(12, 100_000.0, 1.07, 1000).roundToInt() shouldBeEqualTo 447_936
    }

}