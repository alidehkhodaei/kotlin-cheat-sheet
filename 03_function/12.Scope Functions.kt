package `03_function`

fun main() {
    // Scope Functions

    data class Person(var name: String, var age: Int)

    // let

    val message: String? = "Hello"
    message?.let {
        print(it.toUpperCase()) // Output: "HELLO"
    }

    // run

    val message1: String? = "Hello"
    message1?.run {
        print(this.toUpperCase()) // Output: "HELLO"
    }

    // with

    val person2 = Person("Ali", 24)
    val message2 = with(person2) {
        "My name is $name and I'm $age years old."
    }

    // apply

    val person3 = Person("Ali", 24)
    person3.apply {
        name = "Jane"
        age = 25
    }

    // also

    val message4: String? = "Hello"
    message4?.also {
        print(it.toUpperCase()) // Output: "HELLO"
    }


}