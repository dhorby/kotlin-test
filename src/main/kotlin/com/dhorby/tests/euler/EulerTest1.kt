package com.dhorby.tests.euler


fun main(args: Array<String>) {

    println("Started")

    val intRange = 1..999
    val sumOfMultiples = EulerTest1().getSumOfMultiples(intRange)
    println("Results=$sumOfMultiples")
    println("Finished")

}


class EulerTest1 {


    fun getSumOfMultiples(intRange: IntRange): Int {
        return multipleOf3or5(intRange).sum()
    }

    fun multipleOf3or5(intRange: IntRange): List<Int> = intRange.filter { it % 3 == 0 || it % 5 == 0 }

}

