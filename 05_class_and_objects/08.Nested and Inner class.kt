package `05_class_and_objects`

// Nested and Inner class

class Outer {
    private val outerProperty = "Outer property"

    class Nested {
        fun foo() {
            // can't access outerProperty
        }
    }

    inner class Inner {
        fun bar() {
            println(outerProperty) // can access outerProperty
        }
    }
}
