package com.dhorby.tests.euler

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EulerTest1KtTest {

    @Test
    fun `should get sum of multiples of 3 and 5`() {

        val intRange = 1..9
        val sumOfMultiples = EulerTest1().getSumOfMultiples(intRange)
        assertEquals(23, sumOfMultiples)
    }

    @Test
    fun `should return multiples of 3 and 5`() {
        val intRange = 1..9
        val multiplesOf3and5 = EulerTest1().multipleOf3or5(intRange)
        assertEquals(listOf(3, 5, 6, 9), multiplesOf3and5)
    }
}