package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val num = 2642
    val num2 = num / 365
    val num3 = (num - (num2 * 365)) / 7
    val num4 = (num - (num2 * 365)) - 7 * num3
    println("Лет: $num2")
    println("Недель: $num3")
    println("Дней: $num4")
}