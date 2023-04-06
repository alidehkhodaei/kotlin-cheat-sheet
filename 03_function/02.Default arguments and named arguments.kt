package `03_function`

fun main() {
    // Default arguments and named arguments

    fun greet(name: String = "World", greeting: String = "Hello") {
        println("$greeting, $name!")
    }

    greet() // output: Hello, World!

    greet(greeting = "Hi", name = "Ali") // output: Hi, Ali!

    greet(name = "Ali") // output: Hello, Ali!

}