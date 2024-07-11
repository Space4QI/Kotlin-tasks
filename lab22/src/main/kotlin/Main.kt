package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val arr = mutableListOf<Int>()
    println("Введите числа массива. Если числа закончились - введите stop")
    var input: String?
    do {
        input = readLine()
        if (input != "stop") {
            val num = input?.toIntOrNull() ?: throw IllegalArgumentException("Вы должны ввести число")
            arr.add(num)
        }
    } while (input != "stop")

    println(arr.max())
    println(arr.min())
}