package `04_collections`

fun main() {

    // Map

    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    val map2 = mutableListOf(1 to "one", 2 to "two", 3 to "three")

    val numbers = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
    numbers.put("four", 4) // Associates the specified value with the specified key in the map
    numbers.remove("two") // Removes the mapping for the specified key from the map if it is present
    numbers.containsKey("two") // Returns true if the map contains the specified key
    println(numbers)

}