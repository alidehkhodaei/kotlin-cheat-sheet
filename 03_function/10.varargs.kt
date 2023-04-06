package `03_function`

fun main() {
    // Variable number of arguments (varargs)

    fun printNumbers(vararg numbers: Int) {
        for (number in numbers) {
            println(number)
        }
    }

    printNumbers(1, 2, 3) // prints 1, 2, 3
    printNumbers(4, 5, 6, 7, 8) // prints 4, 5, 6, 7, 8

}