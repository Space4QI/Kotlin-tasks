package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите значение прибыли:")
    val profit = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Прибыль должна быть числом")

    println("Введите значение убыли:")
    val losses = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Убыль должна быть числом")

    val balance = profit - losses
    if (balance > 0) {
        println("Ваша прибыль составила: $balance")
    } else if (balance < 0) {
        println("Ваши убытки составили: ${-balance}")
    } else {
        println("Сальдо равно 0")
    }
}
