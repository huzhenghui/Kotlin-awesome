package kotlinx_coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

suspend fun main() = coroutineScope {
    launch {
        delay(1000)
        println("Kotlin Coroutines World!")
    }
    println(App().greeting)
}
