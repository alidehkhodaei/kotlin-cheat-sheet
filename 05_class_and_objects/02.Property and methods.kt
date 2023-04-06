package `05_class_and_objects`

import java.util.*

fun main() {
    // Property and methods

    class Person {

        var age = 0 // property

        // Getter and setter
        var name: String = ""
            get() = field.uppercase(Locale.getDefault())
            set(value) {
                field = "Name: $value"
            }

        fun sayHello() { // method
            println("Hello, my name is $name")
        }
    }

    val person = Person()
    person.name = "Ali"
    person.age = 24
    person.sayHello()
}