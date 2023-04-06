package `03_function`

fun main() {
    // Operator overloading

    data class Point(val x: Int, val y: Int) {
        operator fun plus(other: Point): Point {
            return Point(x + other.x, y + other.y)
        }
    }

    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    val p3 = p1 + p2 // using the overloaded '+' operator
    println(p3) // Output: Point(x=4, y=6)

}