package `05_class_and_objects`


// Interface and Abstract Class

interface Vehicle {
    fun start()
    fun stop()
    val name: String
}

abstract class Animal {
    abstract fun makeSound()
    open fun move() {
        println("Moving...")
    }
}
