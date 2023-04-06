// Polymorphism

abstract class Animal {
    abstract fun makeSound()
}

class Dog : Animal() {
    override fun makeSound() {
        println("Woof!")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Meow!")
    }
}

fun main() {
    val list:List<Animal> = listOf(Cat(), Dog())
    for (item in list) {
        item.makeSound()
    }
}