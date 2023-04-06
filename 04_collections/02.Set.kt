package `04_collections`

fun main() {
    // Set

    val set = setOf(1, 2, 3, 4, 5)
    val set2 = mutableSetOf(1, 2, 3, 4, 5)

    val numbers = mutableSetOf(1, 2, 3)
    numbers.add(4) // Adds the specified element to the set if it is not already present
    numbers.remove(3) // Removes the specified element from the set if it is present
    numbers.contains(1) //  Returns true if the set contains the specified element
    println(numbers)

}