package `02_control_flow`

fun main() {

    // Break and Continue

    for (i in 1..10) {
        if (i == 5) {
            break // Exit loop when i is equal to 5
        }
        if (i % 2 == 0) {
            continue // Skip even numbers and continue to the next iteration
        }
        println(i)
    }

}