package `01_introduction`

fun main() {
    // Operators

    //  Arithmetic operators

    val a = 10
    val b = 5
    println(a + b) // Prints "15"
    println(a - b) // Prints "5"
    println(a * b) // Prints "50"
    println(a / b) // Prints "2"
    println(a % b) // Prints "0"


    //  Comparison operators

    val c = 10
    val d = 5
    println(c > d) // Prints "true"
    println(c >= d) // Prints "true"
    println(c < d) // Prints "false"
    println(c <= d) // Prints "false"
    println(c == d) // Prints "false"
    println(c != d) // Prints "true"

    //  Assignment operators

    var h = 10
    h += 5
    println(h) // Prints "15"
    h -= 5
    println(h) // Prints "10"
    h *= 2
    println(h) // Prints "20"
    h /= 4
    println(h) // Prints "5"
    h %= 3
    println(h) // Prints "1"

    //   Logical operators

    val i = true
    val j = false
    println(i && j) // Prints "false"
    println(i || j) // Prints "true"
    println(!i) // Prints "false"

    //   Bitwise operators

    val k = 0b1010
    val l = 0b1100
    println(k and l) // Prints "8" (0b1000)
    println(k or l) // Prints "14" (0b1110)
    println(k xor l) // Prints "6" (0b0110)

    //  Range operator

    val o = 1..10
    println(o.contains(5)) // Prints "true"
    println(o.contains(11)) // Prints "false"

}