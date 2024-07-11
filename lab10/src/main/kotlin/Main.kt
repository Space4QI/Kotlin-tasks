package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите день недели через число (1-7)")
    val day = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Вы должны ввести число")
    when (day) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Ошибка: существуют только дни с 1 по 7")
    }
}