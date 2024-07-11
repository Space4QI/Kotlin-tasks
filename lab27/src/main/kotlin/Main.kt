package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  yearsEnding()
}

fun yearsEnding() {
    println("Введите год")
    val year = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Введите число")
    if (year % 10 == 1 && year % 100 != 11) {
        println("$year год")
    } else if (year % 10 in 2..4 && year % 100 !in 12..14){
        println("$year года")
    }
    else{
        println("$year лет")
    }
}