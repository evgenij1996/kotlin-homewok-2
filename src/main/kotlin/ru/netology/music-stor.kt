package ru.netology

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Enter the quantity and status of the buyer " +
                "(permanent: 1 / non-permanent: 2)")
        val itemCount = scanner.next().toInt()
        val regOfPurch = scanner.next().toInt()
        if (regOfPurch !in 1..2) {
            println("Incorrect status")
            continue
        }
        val regularityOfPurchases = when (regOfPurch) {
            1 -> true
            else -> false
        }
        val itemPrice = 100
        val discountOne = 100
        val discountTwo = 5 //%
        val discountLevelOne = 1_000
        val discountLevelTwo = 1_000_1

        val totalPrice = itemPrice * itemCount
        val advanceResult = when (totalPrice) {
            in itemPrice..discountLevelOne -> totalPrice
            in discountLevelOne + 1..discountLevelTwo - 1 -> totalPrice - discountOne
            else -> totalPrice - (totalPrice * discountTwo) / 100
        }

        val ultimateResult = if (regularityOfPurchases) advanceResult - advanceResult / 100
        else advanceResult
        println("Total Price: $ultimateResult")
    }
}
