package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите первое число")
    val num = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Вы должны ввести число")
    println("Введите второе число")
    val num2 = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Вы должны ввести число")
    val arr = Array(num2 - num + 1) {0};
    if(num > num2){
        println("Большее число $num")
    }
    else if(num2 > num) {
        println("Большее число $num2")
    }
    else {
        println("Они равны")
    }
    for (i in num..num2) {
        arr[i - num] = i
    }
    println("Массив чисел:  ${arr.joinToString()}")
}