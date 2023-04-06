package `06_other_topics`

fun main() {

// Null safety

    var nullableStr: String? = null
    var nonNullStr: String = "Hello"

// safe call operator
    println(nullableStr?.length) // prints null

// elvis operator
    val len = nullableStr?.length ?: -1
    println(len) // prints -1

// not-null assertion operator

    println(nullableStr!!.length) // throws null pointer exceptions because nullableStr is null

}