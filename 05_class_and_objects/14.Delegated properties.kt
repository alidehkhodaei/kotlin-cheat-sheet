package `05_class_and_objects`

fun main() {
    // Delegated properties

    val myLazyVar: String by lazy {
        // Perform some expensive operation to initialize the variable
        "Hello World"
    }

    println(myLazyVar) // Prints "Hello World"

}