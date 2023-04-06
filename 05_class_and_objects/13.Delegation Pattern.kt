package `05_class_and_objects`

interface Base {
    fun print()
}

fun main() {

// Delegation Pattern

    class BaseImpl(val x: Int) : Base {
        override fun print() {
            print(x)
        }
    }

    class Derived(b: Base) : Base by b

    val b = BaseImpl(10)
    Derived(b).print()

}