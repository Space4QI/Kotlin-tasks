package org.example

fun main() {
    println("Введите число")
    val num = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Вы должны ввести число")
    for (i in 1..num) {
        for (j in 1..i) {
            print(i)
        }
        println()
    }
}