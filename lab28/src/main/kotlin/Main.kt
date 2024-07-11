package org.example

import kotlin.math.round

fun main() {
    println("Введите цену")
    val price = readLine()?.toDoubleOrNull() ?: throw IllegalArgumentException("Введите цену в виде числа")
    println("Введите скидку")
    val discount = readLine()?.toDoubleOrNull() ?: throw IllegalArgumentException("Введите скидку в виде числа")
    val result = calculationDiscount(price, discount)
    println("Сумма с учетом скидки: ${"%.2f".format(result)}")
}

fun calculationDiscount(price: Double, discount: Double): Double {
    return round(price * (100 - discount) / 100 * 100) / 100
}
