package `03_function`

// Higher-Order Functions

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

val sumResult = calculate(1, 7, ::sum)
val mulResult = calculate(1, 7) { a, b -> a * b }

// Returning Functions

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

val func = operation()


