package org.example

fun main() {
    var num = 0
    for(i in 1..100){
        if(i % 4 == 0){
            num += i
        }
    }
    println("Сумма чисел равна $num")

    var num2 = 0
    for(i in 4..100 step 4){
        num2 += i
    }
    println("Сумма чисел равна $num2")
}

