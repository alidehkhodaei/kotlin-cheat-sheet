package `02_control_flow`

fun main() {
    // Conditional Expression

    val a = 7
    val b = 6

    val max = if (a > b) a else b
    println(max)

    // When

    val value = 10

    when (value) {
        15 -> println("Number is 15")
        12 -> println("Number is 12")
        10 -> println("Number is 10")
        else -> println("??")
    }

    // or with a direct expression

    val numberToDisplay = when {
        value % 2 == 0 -> "even"
        else -> "odd"
    }
    println("Number $value is $numberToDisplay")
}