package `02_control_flow`

fun main() {

    // Exceptions

    try {
        val a = 1
        val b = 0
        a / b
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }

    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
}