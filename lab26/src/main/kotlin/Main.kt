package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    rounding()
}

fun rounding() {
    val num = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Вы должны ввести число")
    if(num in 1000..9999){
        val num2 = num / 1000
        println("$num2"+"K")
    }
    else if(num < 1000){
        println(num)
    }
    else {
        println("Введите число в диапазоне от 1000 до 9999 или меньше 1000")
    }
}