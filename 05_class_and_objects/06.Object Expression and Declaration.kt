package `05_class_and_objects`


// Object Expression and Declaration

val person = object {
    val name = "Ali"
    fun sayHello() {
        println("Hello, my name is $name")
    }
}

object Singleton {
    fun doSomething() {
        println("Doing something...")
    }
}

// Companion objects

class MyClass {
    companion object {}
}
