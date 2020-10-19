package ru.netology

import java.util.*

fun main() {
    while (true) {
        println("Введите сумму перевода в копейках")
        val scanner = Scanner(System.`in`)
        val amount = scanner.nextInt()
        val tax = 0.75
        val minTax = 35 * 100

        val taxAmount = if (amount >= minTax) (amount * tax).toInt() / 100 else minTax
        val finalAmount = amount - taxAmount

        println("Сумма комиссии $taxAmount коп")
        println("Сумма перевода с учётом комиссии $finalAmount коп")
    }
}