package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите 2 числа")
    val num = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Вы должны ввести число")
    val num2 = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Вы должны ввести число")
    var num3 = 0
    println("Введите действие: 1, 2 или 0")
    val action = readLine()
    if (action == "1") {
        num3 = num + num2
        println(num3)
    } else if (action == "2") {
        num3 = num - num2
        println(num3)
    } else {
        println("Ничего")
    }
}