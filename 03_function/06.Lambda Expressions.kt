package `03_function`

fun main() {

    // Lambda Expressions

    val sum = { a: Int, b: Int -> a + b }

    val square: (Int) -> Int = { it * it }
}