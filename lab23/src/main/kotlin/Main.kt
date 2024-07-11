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

    val minElement = arr.minOrNull() ?: throw IllegalArgumentException("Массив пустой")
    arr.removeAll { it == minElement }

    val secondMinElement = arr.minOrNull()

    println("Второе минимальное число: $secondMinElement")
}
