package `06_other_topics`

fun main() {
    // Destructuring declarations
    data class Person(val name: String, val age: Int)
    val person = Person("Ali", 24)
    val (name, age) = person
    print("$name $age")
}