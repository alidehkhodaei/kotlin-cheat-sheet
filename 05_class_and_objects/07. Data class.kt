package `05_class_and_objects`

fun main() {

// Data class

    data class Person(val name: String, var age: Int)

    val person = Person("Ali", 24)

    println(person)

}