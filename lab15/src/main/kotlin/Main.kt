package org.example

import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val num = (1..9).random()
    println("Введите число:")
    do {
        val num2 = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Неверный формат ввода")
        if (num != num2) {
            println("Числа не совпадают. Повторите попытку:")
        }
    } while (num != num2)
    println("Числа равны")
}
