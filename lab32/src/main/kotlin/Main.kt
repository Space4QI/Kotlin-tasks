import kotlinx.coroutines.*

suspend fun calculateFactorial(number: Int): Long {
    return withContext(Dispatchers.Default) {
        var result: Long = 1
        for (i in 1..number) {
            result *= i.toLong()
        }
        result
    }
}

fun main() = runBlocking {
    println("Введите число для вычисления факториала:")
    val input = readLine()
    val number = input?.toIntOrNull()

    if (number != null) {
        val factorial = calculateFactorial(number)
        println("Факториал числа $number: $factorial")
    } else {
        println("Ошибка: введено некорректное число.")
    }
}
