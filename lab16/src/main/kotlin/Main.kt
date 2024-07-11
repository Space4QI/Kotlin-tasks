import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    println("Введите число")
    val num = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Ошибка ввода числа")
    println("Делители числа $num")
    val limit = sqrt(abs(num.toDouble())).toInt()
    for (i in 1..limit) {
        if (num % i == 0) {
            println(i)
            if (i != num / i) {
                println(num / i)
            }
        }
    }
}
