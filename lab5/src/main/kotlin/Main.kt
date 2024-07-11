package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите число")
    val n = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Вы должны ввести число")
    val num = n * 2
    println("$n${n*2}")
}