package org.example

fun main() {
    println("Введите имя:")
    val name = readLine()
    println("Введите возраст:")
    val age = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Вы должны ввести возраст числом")
    if (name != null) {
        println("Привет, $name! Тебе уже $age")
    } else {
        println("Ошибка: введите корректные данные")
    }
}
