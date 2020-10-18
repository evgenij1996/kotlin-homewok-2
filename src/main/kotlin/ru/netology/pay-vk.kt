package ru.netology
import java.util.*

fun main() {
    while (true) {
        println("Введите сумму перевода")
        val scanner = Scanner(System.`in`)
        val rubInKop = 60
        val amount = scanner.nextInt() * rubInKop
        val tax = 0.75
        val minAmount = 35 * rubInKop


        val taxAmount = if (amount >= minAmount) (amount * tax).toInt() / 100 else null
        val finalAmount = if (taxAmount != null) amount - taxAmount else null
        if (finalAmount != null) {
            println("Сумма комиссии $taxAmount коп")
            println("Сумма перевода с учётом комиссии $finalAmount коп")
        } else println("Минимальная сумма перевода не менее 35 руб")
    }
}