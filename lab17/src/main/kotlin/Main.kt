package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите число")
    var num = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Ошибка ввода числа")
    num = Math.abs(num)
    var even = 0
    var odd = 0
    while (num > 0){
        val num2 = num % 10
        if(num2 % 2 == 0){
            even++
        }
        else{
            odd++
        }
        num = num / 10
    }
    println("Кол-во чётных чисел $even")
    println("Кол-во нечётных чисел $odd")
}