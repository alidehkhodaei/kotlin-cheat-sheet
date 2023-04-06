package `03_function`

// Extension Functions and Properties

// Extension function
fun String.reverse(): String {
    return this.reversed()
}

// Extension property
val String.firstChar: Char
    get() = this[0]

fun main() {

    val str = "Ali"
    println(str.reverse())  // Prints "ilA"
    println(str.firstChar)  // Prints "A"

}