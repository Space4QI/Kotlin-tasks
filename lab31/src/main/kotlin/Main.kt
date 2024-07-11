import kotlinx.coroutines.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    runBlocking {
        val coroutine = launch {
            while (true) {
                delay(1000L)
                val currentTime = LocalDateTime.now()
                val formattedTime = currentTime.format(DateTimeFormatter.ISO_LOCAL_TIME)
                println(formattedTime)
            }
        }
        coroutine.join()
    }
}
