import kotlin.random.Random
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun generate(index: Int): Pair<Int, String> {
    val randomNumber = Random.nextInt(100)
    val result = if (randomNumber % 2 == 0) "Четное" else "Нечетное"
    return index to result
}

fun main() = runBlocking {
    val results = mutableMapOf<Int, String>()

    val time = measureTimeMillis {
        // Создаем и запускаем 100 000 корутин
        val jobs = List(100_000) {

            launch {
                val (index, result) = generate(it)
                results[index] = result
            }
        }
        jobs.forEach { it.join() }
    }
    val successfulTasks = results.count { it.value == "Четное" }
    println("Количество успешно выполненных задач: $successfulTasks")
    println("Общее время выполнения всех корутин: $time мс")
}
