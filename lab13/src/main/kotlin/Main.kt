package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите 2 числа")
    val num = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Вы должны ввести число")
    val num2 = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Вы должны ввести число")
    val result = if (num % 2 == 0 && num2 % 2 == 0) "true" else "false"
    println(result)
}