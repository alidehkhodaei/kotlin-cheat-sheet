package `06_other_topics`

data class Person(val name: String, val age: Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age.compareTo(other.age)
    }
}

fun main() {
    val person1 = Person("Ali", 24)
    val person2 = Person("Reza", 30)

    if (person1 < person2) {
        println("${person1.name} is younger than ${person2.name}")
    } else {
        println("${person1.name} is older than ${person2.name}")
    }
////////////////////////////////////////////////////////////////
    val people = listOf(
        Person("Ali", 24),
        Person("Reza", 40),
        Person("Shabnam", 23)
    )
    val sortedPeople = people.sorted() // [Person(name=Shabnam, age=23), Person(name=Ali, age=24), Person(name=Reza, age=40)]
    println(sortedPeople.toString())
}