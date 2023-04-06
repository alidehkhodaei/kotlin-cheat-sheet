package `04_collections`

fun main() {
    // List
    val list = listOf(1, 2, 3, 4, 5)
    val list2 = mutableListOf(1, 2, 3, 4, 5)

    val numbers = mutableListOf(1, 2, 3)
    numbers.add(4) // Adds the specified element to the end of the list
    numbers.remove(3) // Removes the first occurrence of the specified element from the list
    numbers[1] // Returns the element at the specified index in the list
    println(numbers)
}