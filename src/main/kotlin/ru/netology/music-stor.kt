package ru.netology

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Enter the current and previous value," +
                " as well as the status of the buyer " +
                "(permanent: 1 / non-permanent: 2)")
        val currentValue = scanner.next().toInt()
        val previousValue = scanner.next().toInt()
        val regOfPurch = scanner.next().toInt()
        if (regOfPurch !in 1..2) {
            println("Incorrect status")
            continue
        }
        val regularityOfPurchases = when (regOfPurch) {
            1 -> true
            else -> false
        }
        val discountOne = 100
        val discountTwo = 0.05
        val discountThresholdOne = 1_000
        val discountThresholdTwo = 10_000
        val regularCustomerDiscount = 0.01

        val previousResult = when {
            previousValue <= discountThresholdOne -> currentValue
            previousValue in discountThresholdOne + 1..discountThresholdTwo -> currentValue - discountOne
            else -> (currentValue - currentValue * discountTwo).toInt()
        }

        val ultimateResult = if (regularityOfPurchases)
            (previousResult - previousResult * regularCustomerDiscount).toInt()
        else previousResult
        println("Total Price: $ultimateResult")
    }
}
