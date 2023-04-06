package `02_control_flow`

fun main() {

    // Ranges

    for (i in 0..3) {
        print(i)
    }

    for (i in 0 until 3) {
        print(i)
    }

    for (i in 2..8 step 2) {
        print(i)
    }

    for (i in 3 downTo 0) {
        print(i)
    }

    for (c in 'a'..'d') {
        print(c)
    }

    if (2 in 1..5) {
        print("x is in range from 1 to 5")
    }
}