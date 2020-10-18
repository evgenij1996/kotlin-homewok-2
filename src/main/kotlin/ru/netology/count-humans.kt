package ru.netology

import java.util.*

fun main() {
    while (true) {
        val scanner = Scanner(System.`in`)
        println("Количество лайков:")
        val likes = scanner.nextLine()
        if (likes.matches(Regex("\\d*[^1]*1"))
                && !likes.matches(Regex("\\d*11"))) println("Понравилось $likes человеку")
        else println("Понравилось $likes людям")
    }
}
