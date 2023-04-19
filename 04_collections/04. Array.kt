fun main() {

    // Array

    val numbers = arrayOf<Int>(9,8,7,6,1, 2, 3, 4, 5)

    println(numbers) // [Ljava.lang.Integer;@41629346

    println(numbers.contentToString()) // [9, 8, 7, 6, 1, 2, 3, 4, 5]

    ////////////

    val firstNumber = numbers[0]

    val lastNumber = numbers[numbers.size - 1]

    println(firstNumber) // 9

    println(lastNumber) // 5

    ////////////

    for (number in numbers) {
        println(number)
    }

    ////////////

    numbers.sort()

    println(numbers.contentToString()) // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    numbers.reverse()

    println(numbers.contentToString()) // [9, 8, 7, 6, 5, 4, 3, 2, 1]

}
