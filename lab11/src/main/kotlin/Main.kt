package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите 3 числа")
    val num = readLine()?.toIntOrNull()
    val num2 = readLine()?.toIntOrNull()
    val num3 = readLine()?.toIntOrNull()
    if (num != null && num2 != null && num3 != null) {
        if ((num < num2 && num2 < num3) || (num3 < num2 && num2 < num)) {
            println(num2)
        } else if ((num < num && num < num3) || (num3 < num && num < num2)) {
            println(num)
        } else if ((num < num3 && num3 < num2) || (num2 < num3 && num3 < num)) {
            println(num3)
        } else {
            println("Ошибка")
        }
    }
    else{
        println("Ошибка: введите число(-а)")
    }
}
