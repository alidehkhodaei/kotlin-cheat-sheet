package `03_function`

fun main() {
    // Infix notation

    infix fun Int.times(str: String) = str.repeat(this)

    val str = 5 times "Hello "
    println(str) // Output: "Hello Hello Hello Hello Hello "

}