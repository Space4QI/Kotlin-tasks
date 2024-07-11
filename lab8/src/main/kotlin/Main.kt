package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите возраст")
    val age = readLine()?.toIntOrNull()?:throw IllegalArgumentException("Возраст должен быть числом")
    if(age >= 0)
        if(age > 18) {
            println("Вам уже все можно")
        }
        else if (age == 18) {
            println("Ура, Вам 18 лет!")
        }
        else{
            println("Вы еще слишком молоды")
    }
    else {
        println("Возраст не может быть отрицательным")
    }
}