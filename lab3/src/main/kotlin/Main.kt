package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите четырёхзначное число")
    val num = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Введите число");
    if(999 < num && num < 10000) {
        val num2 = num / 1000
        val num3 = num / 100 % 10
        val num4 = num / 10 % 10
        val num5 = num % 10
        println(num2)
        println(num3)
        println(num4)
        println(num5)
    }
    else {
        println("Ошибка: вы ввели не четырёхзначное число")
    }
}