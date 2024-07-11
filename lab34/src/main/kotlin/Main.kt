import kotlinx.coroutines.*

suspend fun <T> withTimeout(seconds: Long, block: suspend () -> T): T {
    return withTimeoutOrNull(seconds * 1000) {
        block()
    } ?: throw Exception("Too long body execution")
}

suspend fun longRunningFunction() {
    delay(2000) // Подождем 2 секунды
    println("Long running function completed")
}

suspend fun shortRunningFunction() {
    delay(500) // Подождем полсекунды
    println("Short running function completed")
}

fun main() {
    try {
        runBlocking {
            withTimeout(1) {
                longRunningFunction()
            }
        }
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        runBlocking {
            withTimeout(1) {
                shortRunningFunction()
            }
        }
    } catch (e: Exception) {
        println(e.message)
    }
}
