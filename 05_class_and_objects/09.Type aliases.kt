package `05_class_and_objects`

typealias NumberPredicate = (Int) -> Boolean
typealias NumberMapper = (Int) -> String

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val even: NumberPredicate = { number -> number % 2 == 0 }
    val mapper: NumberMapper = { number -> "Number is $number" }
    numbers.filter(even).map(mapper).forEach(::println)
}