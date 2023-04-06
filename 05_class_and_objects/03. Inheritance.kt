package `05_class_and_objects`

fun main() {
    // Inheritance

    open class Animal(val name: String) {
        open fun makeSound() {
            println("Animal sound")
        }
    }

    class Dog(name: String) : Animal(name) {
        override fun makeSound() {
            println("Woof!")
        }
    }

}