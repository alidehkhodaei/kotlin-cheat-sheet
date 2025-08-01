<h1 id="my-title"> Kotlin Cheatsheet </h1>
A Kotlin cheat sheet is a quick reference guide that provides a concise summary of the most important Kotlin syntax and features. Most of the content in this cheat sheet has been collected from the official Kotlin documentation while avoiding detailed explanations. This cheat sheet is designed for quick review purposes and not for providing detailed information, so I suggest that you also read the official
<a href="https://kotlinlang.org/docs/home.html"> Kotlin documentation</a>. 

If there is any issue, please open an issue or feel free to contribute to its expansion. If you'd like to support me, please give a star to this repository.⭐

![Kotlin logotype](https://github.com/alidehkhodaei/kotlin-cheatsheet/raw/main/images/kotlin_logotype.jpg)

# Table of Contents


- [Introduction](#introduction)
  - [First Kotlin program](#first-kotlin-program)
  - [Get input from user](#get-input-from-user)
  - [Comments](#comments)
  - [KDoc](#kdoc)
  - [Variables](#variables)
  - [Data types](#data-types)
  - [Type Inference](#type-inference)
  - [Type Conversion](#type-conversion)
  - [String templates](#string-templates)
  - [Character escape](#character-escape)
  - [Operators](#operators)
- [Control Flow](#control-flow)
  - [If-else](#if-else)
  - [When](#when)
  - [Conditional Expression](#conditional-expression)
  - [For loop](#for-loop)
  - [Ranges](#ranges)
  - [While](#while)
  - [Do while](#do-while)
  - [Break and Continue](#break-and-continue)
  - [Exceptions](#exceptions)
- [Functions](#functions)
  - [Function Declaration](#function-declaration)
  - [Default arguments and named arguments](#default-arguments-and-named-arguments)
  - [Function Return Types](#function-return-type)
  - [Local functions](#local-functions)
  - [Member functions](#member-functions)
  - [Generic functions](#generic-functions)
  - [Lambda Expressions](#lambda-expressions)
  - [Extension Functions and Properties](#extension-functions-and-Properties)
  - [Higher-Order Functions](#higher-order-functions)
  - [Operator overloading](#operator-overloading)
  - [Variable number of arguments (varargs)](#varargs)
  - [Infix notation](#infix-notation)
  - [Scope Functions](#scope-functions)
- [Collections](#collections)  
  - [Array](#array)
  - [List](#list)
  - [Map](#map)
  - [Set](#set)  
- [Classes and objects](#class-and-object)
  - [Classes](#classes)
  - [Property and methods](#property-and-methods)
  - [Getters and setters](#getters-and-setters)
  - [Visibility modifiers](#visibility-modifiers)
  - [Late-initialized properties and variables](#late-initialized-properties-and-variables)
  - [Inheritance](#inheritance)
  - [Interface and Abstract Class](#interface-and-abstract-class)
  - [Abstraction](#abstraction)
  - [Polymorphism](#polymorphism)
  - [Object Expression and Declaration](#object-expression-and-declaration)
  - [Data class](#data-class)
  - [Nested and Inner class](#nested-and-inner-class)
  - [Type aliases](#type-aliases)
  - [Enum](#enum)
  - [Sealed class and interface](#sealed-class-and-interface)
  - [Generics](#generics)
  - [Delegation Pattern](#delegation-pattern)
  - [Delegated properties](#delegated-properties)
- [Other Topics](#other-topics)
  - [Destructuring declarations](#destructuring-declarations)
  - [Reflection](#reflection)
  - [Annotations](#annotations)
  - [Packages and imports](#packages-and-imports)
  - [Null safety](#null-safety)
  - [Equality](#equality)
  - [Comparable](#comparable)
  - [Regex](#regex)
- <a href="https://kotlinlang.org/docs/keyword-reference.html">Kotlin Keywords and operators (Document link)</a>

 
  
## Introduction <a name="introduction"></a>
Kotlin is a modern, open-source programming language that is used for building multi-platform applications. It is concise, expressive, and powerful, with features such as null safety, extension functions, lambdas, and many others.
This cheat sheet will cover some of the essential Kotlin concepts.

### First Kotlin program <a name="first-kotlin-program"></a>

This is an example of printing "Hello world" in Kotlin:
```kotlin
fun main() {
    println("Hello world")
}
```
### Get input from user  <a name="get-input-from-user"></a>
To get input from the user in Kotlin, you can use the readLine() function.
This is an example:
```kotlin
fun main() {
    print("Enter your name: ")
    val name = readLine()
    println("Hello, $name!")
}
```

### Comments<a name="comments"></a>

```kotlin
// This is an end-of-line comment

/* This is a block comment
   on multiple lines. */
```
Block comments in Kotlin can be nested.
```kotlin
/* The comment starts here
/* contains a nested comment *⁠/
and ends here. */
```
### KDoc <a name="kdoc"></a>
KDoc is the documentation format for Kotlin, similar to Javadoc for Java. KDoc is used to generate documentation for Kotlin classes, functions, and properties. KDoc comments start with the /** and end with */.
This is an example:
```kotlin
/**
 * Calculates the sum of two integers.
 *
 * @param a The first integer to add.
 * @param b The second integer to add.
 * @return The sum of the two integers.
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}
```

### Variables <a name="variables"></a>
In Kotlin, variables can be declared using either the var or val keyword.

var variables are mutable, meaning their value can be changed after they are initialized.

```kotlin
var x = 5
x = 10
```
val variables, on the other hand, are immutable, meaning their value cannot be changed after they are initialized.

```kotlin
val y = 5
y = 10 // This will result in a compilation error
```

### Data types <a name="data-types"></a>
Here's a brief overview of the most commonly used data types:

```kotlin
    val booleanVar: Boolean = true
    val byteVar: Byte = 127
    val shortVar: Short = 32767
    val intVar: Int = 2147483647
    val longVar: Long = 9223372036854775807L
    val floatVar: Float = 3.14f
    val doubleVar: Double = 3.14159265358979323846
    val charVar: Char = 'A'
    val stringVar: String = "Hello, world!"
```

### Type Inference <a name="type-inference"></a>

Kotlin supports type inference, which means the compiler can infer the type of a variable from its initial value.

```kotlin
val x = 5 // The type of x is inferred to be Int
val y = "hello" // The type of y is inferred to be String
```

Variables in Kotlin can also be declared without an initial value, but in that case, the type must be explicitly specified:

```kotlin
var z: Double // Valid, z has no initial value
// println(z) // Invalid, z is not initialized and has no value yet
z = 3.14 // Valid, z is initialized with a value
```
### Type Conversion <a name="type-conversion"></a>

Kotlin provides several methods for converting between data types. Here's an example in Kotlin that demonstrates various methods of type conversion.

```kotlin
    val str: String = "123"
    val num: Int = str.toInt() // Convert String to Int

    val dbl: Double = 123.45
    val int: Int = dbl.toInt() // Convert Double to Int

    val lng: Long = 9876543210
    val flt: Float = lng.toFloat() // Convert Long to Float

    val bol: Boolean = true
    val strBol: String = bol.toString() // Convert Boolean to String

    val char: Char = 'A'
    val intChar: Int = char.toInt() // Convert Char to Int // Conversion of Char to Number is deprecated. Use Char.code property instead.

    val byte: Byte = 127
    val short: Short = byte.toShort() // Convert Byte to Short
```

### String templates <a name="string-templates"></a>

```kotlin
val name= "Ali"
val result= "My name is $name" 
```

### Character escape <a name="character-escape"></a>

```kotlin
\n insert new line
\t inserts a tab
\r inserts carriage return
```

### Operators <a name="operators"></a>

Arithmetic operators

```kotlin
  val a = 10
  val b = 5
  println(a + b) // 15
  println(a - b) // 5
  println(a * b) // 50
  println(a / b) // 2
  println(a % b) // 0
 ```
  
 Comparison operators
```kotlin
  val c = 10
  val d = 5
  println(c > d) // true
  println(c >= d) // true
  println(c < d) // false
  println(c <= d) // false
  println(c == d) // false
  println(c != d) // true
 ```
  
Assignment operators
  
 ```kotlin
  var h = 10
  h += 5
  println(h) // 15
  h -= 5
  println(h) // 10
  h *= 2
  println(h) // 20
  h /= 4
  println(h) // 5
  h %= 3
  println(h) // 1
 ```
    
Logical operators    
```kotlin  
  val i = true
  val j = false
  println(i && j) // false
  println(i || j) // true
  println(!i) // false
 ```
    
Bitwise operators

```kotlin
  val k = 0b1010
  val l = 0b1100
  println(k and l) // Prints "8" (0b1000)
  println(k or l) // Prints "14" (0b1110)
  println(k xor l) // Prints "6" (0b0110)
 ```

Range operator

```kotlin
  val o = 1..10
  println(o.contains(5)) // Prints "true"
  println(o.contains(11)) // Prints "false"
```
    
## Control flow  <a name="control-flow"></a>

### If-else <a name="if-else"></a>

```kotlin
if (condition) {
    // Code to execute if condition is true
} else {
    // Code to execute if condition is false
}
```

### When <a name="when"></a>

```kotlin
when (value) {
    condition1 -> // Code to execute if value matches condition1
    condition2 -> // Code to execute if value matches condition2
    else -> // Code to execute if value does not match any condition
}
```

### Conditional Expression <a name="conditional-expression"></a>
Given if and when are expressions, we can directly assign them to variables.

```kotlin
val seasonFirstMonth = when(season) {
    "spring" -> 1
    "summer" -> 2
    "autumn" -> 3
    "winter" -> 4
    else -> error("There is only 4 seasons")
}
```

Thus, it allows a similar ternary operator using a regular if.

```kotlin
val max = if (a > b) a else b         
```

### For loop <a name="for-loop"></a>
```kotlin
for (item in collection) {
    // Code to execute for each item in collection
}
```

### Ranges <a name="ranges"></a>
There is a set of tools for defining ranges in Kotlin.
```kotlin

for(i in 0..3) {             
    print(i)
}

for(i in 0 until 3) {       
    print(i)
}

for(i in 2..8 step 2) {     
    print(i)
}

for (i in 3 downTo 0) {     
    print(i)
}
```
Char ranges are also supported.
```kotlin
for (c in 'a'..'d') {   
    print(c)
}
```
Ranges are also useful in if statements.

```kotlin
if (x in 1..5) {           
    print("x is in range from 1 to 5")
}
```
### While <a name="while"></a>
```kotlin  
while (condition) {
    // Code to execute as long as condition is true
}
```

### Do While <a name="do-while"></a>

```kotlin
do {
    // Code to execute at least once
} while (condition)
```

### Break and Continue <a name="break-and-continue"></a>

```kotlin
for (i in 1..10) {
    if (i == 5) {
        break // Exit loop when i is equal to 5
    }
    if (i % 2 == 0) {
        continue // Skip even numbers and continue to the next iteration
    }
    // Code to execute for each odd number between 1 and 10
}
```
### Exceptions  <a name="exceptions"></a>

To throw an exception object, use the throw expression:

```kotlin
throw Exception("Exception...")
```
To catch an exception, use the try...catch expression:

```kotlin
try {
    // some code
} catch (e: SomeException) {
    // handler
} finally {
    // optional finally block
}
```
The Nothing type: This type has no values and is used to mark code locations that can never be reached. In your own code, you can use Nothing to mark a function that never returns.
```kotlin
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
```
## Functions <a name="functions"></a>

### Function Declaration  <a name="function-declaration"></a>

```kotlin
fun sayHello() {
    println("Hello!")
}

fun greet(name: String) {
    println("Hello, $name!")
}
```

### Default arguments and named arguments  <a name="default-arguments-and-named-arguments"></a>

  ```kotlin
fun greet(name: String = "World", greeting: String = "Hello") {
    println("$greeting, $name!")
}

fun main() {
    // calling function with default arguments
    greet() // output: Hello, World!

    // calling function with named arguments
    greet(greeting = "Hi", name = "Ali") // output: Hi, Ali!

    // calling function with some named arguments
    greet(name = "Reza") // output: Hello, Reza!
}

  ```
### Function Return Types  <a name="function-return-type"></a>

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int) = a * b
```

Unit-returning functions
If a function does not return a value, its return type is Unit.

```kotlin
fun printHello(): Unit {
  print("Hello")
}
```
Or
```kotlin
fun printHello() {
   print("Hello")
}
```

### Local functions <a name="local-functions"></a>

Kotlin supports local functions, which are functions inside other functions.
printMessage() is a local function defined within the main() function.
```kotlin
fun main() {
    fun printMessage(message: String) {
        println("Message: $message")
    }

    printMessage("Hello, world!")
}
```

### Member functions <a name="member-functions"></a>

A member function is a function that is defined inside a class or object.

```kotlin
class Sample {
    fun foo() {//...}
}
```

### Generic functions <a name="generic-functions"></a>

Functions can have generic parameters, which are specified using angle brackets before the function name

```kotlin
fun <T> function(item: T){ 
 //Code
}
```

### Lambda Expressions  <a name="lambda-expressions"></a>

```kotlin
val sum = { a: Int, b: Int -> a + b }

val square: (Int) -> Int = { it * it }
```
### Extension Functions and Properties <a name="extension-functions-and-Properties"></a>
Extension Functions and Properties in Kotlin allow adding new functionality or properties to existing classes without modifying their source code.
```kotlin
// Extension function
fun String.reverse(): String {
    return this.reversed()
}

// Extension property
val String.firstChar: Char
    get() = this[0]
```
```kotlin
fun main() {
    val str = "Ali"
    println(str.reverse())  // Prints "ilA"
    println(str.firstChar)  // Prints "A"
}

```
### Higher-Order Functions <a name="higher-order-functions"></a>

A higher-order function is a function that takes another function as parameter and/or returns a function.

- Taking Functions as Parameters

```kotlin
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int { 
    return operation(x, y)                                         
}

fun sum(x: Int, y: Int) = x + y                                 
```

```kotlin
fun main() {
    val sumResult = calculate(1, 7, ::sum)                         
    val mulResult = calculate(1, 7) { a, b -> a * b }             
}
```

- Returning Functions

```kotlin
fun operation(): (Int) -> Int {                                     
    return ::square
}

fun square(x: Int) = x * x                                          
```

```kotlin
fun main() {
    val func = operation()                                          
    println(func(7))                                                
}
```

### Operator overloading <a name="operator-overloading"></a>
Operator overloading in Kotlin allows you to define and use custom operators for your own classes and types.

```kotlin
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}
```

```kotlin
fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    val p3 = p1 + p2 // using the overloaded '+' operator
    println(p3) // Output: Point(x=4, y=6)
}

```

### Variable number of arguments (varargs) <a name="varargs"></a>

 Varargs is a feature that allows you to pass a variable number of arguments of the same type to a function
 
```kotlin
fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main() {
    printNumbers(1, 2, 3) // prints 1, 2, 3
    printNumbers(4, 5, 6, 7, 8) // prints 4, 5, 6, 7, 8
}

```

### Infix notation <a name="infix-notation"></a>

Infix in Kotlin allows you to define functions that can be called using infix notation (i.e., without using parentheses and the dot notation).

```kotlin
infix fun Int.times(str: String) = str.repeat(this)

fun main() {
    val str = 5 times "Hello "
    println(str) // Output: "Hello Hello Hello Hello Hello "
}
```

### Scope Functions <a name="scope-functions"></a>

- let

let can be used for scoping and null-checks. When called on an object, let executes the given block of code and returns the result of its last expression. The object is accessible inside the block by the reference it (by default) or a custom name.

```kotlin
val message: String? = "Hello"
message?.let {
    print(it.toUpperCase()) // Output: "HELLO"
}
```

- run

Like let, run is another scoping function from the standard library. Basically, it does the same: executes a code block and returns its result. The difference is that inside run the object is accessed by this. This is useful when you want to call the object's methods rather than pass it as an argument.

```kotlin
val message: String? = "Hello"
message?.run {
    print(this.toUpperCase()) // Output: "HELLO"
}
```
- with

with is a non-extension function that can access members of its argument concisely: you can omit the instance name when referring to its members.
```kotlin
val person = Person("Ali", 24)
val message = with(person) {
    "My name is $name and I'm $age years old."
}
```
- apply

apply executes a block of code on an object and returns the object itself. Inside the block, the object is referenced by this. This function is handy for initializing objects.
```kotlin
val person = Person("Ali", 24)
person.apply {
    name = "Ali"
    age = 24
}
```

- also

also works like apply: it executes a given block and returns the object called. Inside the block, the object is referenced by it, so it's easier to pass it as an argument. This function is handy for embedding additional actions, such as logging in call chains.
```kotlin
val message: String? = "Hello"
message?.also {
    print(it.toUpperCase()) // Output: "HELLO"
}
```

## Collections <a name="collections"></a>

### Array <a name="array"></a>

An array is a fixed-size collection of elements of the same data type.

- Declaring and Initializing Arrays

```kotlin

// Declare an array of integers
val numbers = arrayOf(1, 2, 3, 4, 5)

// Declare an array of strings
val names = arrayOf("Alice", "Bob", "Charlie", "Dave")

// Declare an array of a specific size
val array = arrayOfNulls<Int>(10)

// Declare an array of integers with a specified size and initial value
val array = Array<Int>(7) { i -> i*i }
val filledArray = IntArray(5) { index -> index * 2 } // Other type: BooleanArray, ShortArray, DoubleArray and etc.

```
- Accessing Array Elements

```kotlin
// Access an element at a specific index
val firstNumber = numbers[0]

// Access the last element of an array
val lastNumber = numbers[numbers.size - 1]
```

- Modifying Array Elements

```kotlin
// Modify an element at a specific index
numbers[0] = 10

// Fill an array with a specific value
Arrays.fill(numbers, 0)
```

- Iterating over Arrays

```kotlin

// Iterate over an array using a for loop
for (number in numbers) {
    println(number)
}

// Iterate over an array using a for loop with an index
for (i in names.indices) {
    println("${i}: ${names[i]}")
}

// Iterate over an array using a forEach loop
names.forEach { name ->
    println(name)
}
```

- Basic methods

```kotlin
val index = numbers.indexOf(3)

numbers.sort()

names.reverse()
```

### List <a name="list"></a>

- A collection of elements in a specified order
- Can have duplicates
- Immutable: listOf(), or mutable: mutableListOf()
- List: This is the basic interface for a read-only list of elements.
- MutableList: This is a subinterface of List that allows for mutable operations such as adding or removing elements.
- ArrayList: This is an implementation of MutableList that uses an array to store elements.
- LinkedList: This is an implementation of MutableList that uses a linked list to store elements.

```kotlin
val list = listOf(1, 2, 3, 4, 5)
val list2=mutableListOf(1, 2, 3, 4, 5)
```
Basic methods:
```kotlin
    val numbers = mutableListOf(1, 2, 3)
    numbers.add(4) // Adds the specified element to the end of the list
    numbers.remove(3) // Removes the first occurrence of the specified element from the list
    numbers[1] // Returns the element at the specified index in the list
```

### Map <a name="map"></a>

- A collection of key-value pairs
- Keys must be unique
- Immutable: mapOf(), or mutable: mutableMapOf()
- Map: This is the basic interface for a read-only map of key-value pairs.
- MutableMap: This is a subinterface of Map that allows for mutable operations such as adding or removing key-value pairs.
- HashMap: This is an implementation of MutableMap that uses a hash table to store key-value pairs.
- LinkedHashMap: This is an implementation of MutableMap that maintains the insertion order of key-value pairs.
- SortedMap: This is an interface for a map that maintains its key-value pairs in sorted order.
- TreeMap: This is an implementation of SortedMap.

```kotlin
val map = mapOf(1 to "one", 2 to "two", 3 to "three")
val map2= mutableListOf(1 to "one", 2 to "two", 3 to "three")
```

Basic methods:
```kotlin
    val numbers =  mutableMapOf("one" to 1, "two" to 2, "three" to 3)
    numbers.put("four", 4) // Associates the specified value with the specified key in the map
    numbers.remove("two") // Removes the mapping for the specified key from the map if it is present
    numbers.containsKey("two") // Returns true if the map contains the specified key
```

### Set <a name="set"></a>

- A collection of elements with no duplicates
- Elements are not in a specific order
- Immutable: setOf(), or mutable: mutableSetOf
- Set: This is the basic interface for a read-only set of elements.
- MutableSet: This is a subinterface of Set that allows for mutable operations such as adding or removing elements.
- HashSet: This is an implementation of MutableSet that uses a hash table to store elements. 
- LinkedHashSet: This is an implementation of MutableSet that maintains the insertion order of elements.
- SortedSet: This is an interface for a set that maintains its elements in sorted order.
- TreeSet: This is an implementation of SortedSet.


```kotlin
val set = setOf(1, 2, 3, 4, 5)
val set2=mutableSetOf(1, 2, 3, 4, 5)
```

Basic methods:
```kotlin
    val numbers =  mutableSetOf(1, 2, 3)
    numbers.add(4) // Adds the specified element to the set if it is not already present
    numbers.remove(3) // Removes the specified element from the set if it is present
    numbers.contains(1) //  Returns true if the set contains the specified element
```
Please for more collections and detaile read doc.

## Class and Object <a name="class-and-object"></a>

### Classes <a name="classes"></a>

- A class is a blueprint for creating objects.
- An object is an instance of a class.

```kotlin
class Person(val name: String, var age: Int) // class

val person = Person("Ali", 24) // object
```

### Property and methods <a name="property-and-methods"></a>

- Properties are variables that are part of a class/object.
- Methods are functions that are part of a class/object.

```kotlin
class Person(val name: String) {
   var age = 0 // property

   fun sayHello() { // method
      println("Hello, my name is $name")
   }
}

val person = Person("Ali")
person.age = 24
person.sayHello()
```

### Getters and setters <a name="getters-and-setters" ></a>

Getter and setter in Kotlin are accessors used to retrieve and modify the value of a variable, respectively. The initializer, getter, and setter are optional. 

```kotlin
class Person {
    var name: String = ""
        get() = field.uppercase(Locale.getDefault())
        set(value) {
            field = "Name: $value"
        }

    var age = 24 // has default getter and setter

    val username="Ali" // has default getter

}
```
For more details about properties, getter/setter, backing fields, backing properties﻿ and etc read this <a href="https://kotlinlang.org/docs/properties.html">link</a>.

### Visibility modifiers <a name="visibility-modifiers" ></a>

- private: restricts visibility to the same class.
- protected: restricts visibility to the same class and its subclasses.
- internal: restricts visibility to the same module.
- public: allows visibility from anywhere.

### Late-initialized properties and variables <a name="late-initialized-properties-and-variables"></a>

A lateinit variable is used when you know that a variable will be initialized before it is used, but you don't want to assign an initial value at the time of declaration.

```kotlin
lateinit var myLateInitVar: String

// The variable is not initialized yet, so trying to access it will throw an exception
// println(myLateInitVar) // This line would throw a "lateinit property has not been initialized" exception

// Sometime later, the variable is initialized
myLateInitVar = "Hello World"

// Now we can access the variable without an exception
println(myLateInitVar) // Prints "Hello World"
```

### Inheritance <a name="inheritance"></a>
Inheritance is the process by which one class acquires the properties and methods of another class.

```kotlin
open class Animal(val name: String) {
   open fun makeSound() {
      println("Animal sound")
   }
}

class Dog(name: String): Animal(name) {
   override fun makeSound() {
      println("Woof!")
   }
}
```

### Interface and Abstract Class <a name="interface-and-abstract-class"></a>
Both interface and abstract class provide a way to define contracts or blueprints for classes to follow. They are used for abstraction.

```kotlin
interface Vehicle {
    fun start()
    fun stop()
    val name: String
}
```
```kotlin
abstract class Animal {
    abstract fun makeSound()
    open fun move() {
        println("Moving...")
    }
}
```

### Abstraction <a name="abstraction"></a>
Abstraction is a mechanism for hiding the implementation details of an object and exposing only the necessary details to the user. In Kotlin, abstraction is achieved through interfaces and abstract classes.

### Polymorphism <a name="polymorphism"></a>
Polymorphism is the ability of an object to take many forms.
```kotlin
class Dog : Animal() {
    override fun makeSound() {
        println("Woof!")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Meow!")
    }
}
```
In this example, both Dog and Cat classes inherit from the Animal abstract class and provide their own implementation of the makeSound() method, which demonstrates polymorphism.

### Object Expression and Declaration <a name="object-expression-and-declaration"></a>

An object expression creates an instance of an anonymous class, while an object declaration creates a singleton instance of a class. 

```kotlin
val person = object {
    val name = "Ali"
    fun sayHello() {
        println("Hello, my name is $name")
    }
}

object Singleton {
    fun doSomething() {
        println("Doing something...")
    }
}
```

Companion objects
An object declaration inside a class can be marked with the companion keyword.
```kotlin
class MyClass {
    companion object { }
}
```

### Data class <a name="data-class"></a>
A data class is a special class that is designed to hold data.

```kotlin
data class Person(val name: String, var age: Int)

val person = Person("Ali", 24)
```

### Nested and Inner class <a name="nested-and-inner-class"></a>

- A nested class is a class that is defined inside another class.
- An inner class is a nested class that has access to the members of the outer class.

```kotlin
class Outer {
   private val outerProperty = "Outer property"

   class Nested {
      fun foo() {
         // can't access outerProperty
      }
   }

   inner class Inner {
      fun bar() {
         println(outerProperty) // can access outerProperty
      }
   }
}
```

### Type aliases <a name="type-aliases"></a>
Type aliases provide alternative names for existing types. If the type name is too long you can introduce a different shorter name and use the new one instead.

Before using a type alias
```kotlin
val numbers = listOf(1, 2, 3, 4, 5)
numbers.filter { number: Int -> number % 2 == 0 }.map { number: Int -> "Number is $number" }
```

After using a type alias
```kotlin
typealias NumberPredicate = (Int) -> Boolean
typealias NumberMapper = (Int) -> String

val numbers = listOf(1, 2, 3, 4, 5)
val even: NumberPredicate = { number -> number % 2 == 0 }
val mapper: NumberMapper = { number -> "Number is $number" }
numbers.filter(even).map(mapper)
```

### Enum  <a name="enum"></a>
An enum is a type that represents a fixed set of values.

```kolitn
enum class Color {
   RED, GREEN, BLUE
}
```

### Sealed class and interface <a name="sealed-class-and-interface"></a>

A sealed class/interface restricts the inheritance of its subclasses/interfaces to only within the same file.

```kotlin
sealed class Shape

class Circle: Shape()

// Can't subclass Shape outside of this file
```

### Generics <a name="generics"></a>
A generic concept in Kotlin allows for type-safe programming by creating reusable classes, functions, and interfaces that can work with any data type.
```kotlin
class Box<T>(t: T) {
    var value = t
}
```

### Delegation Pattern<a name="delegation-pattern"></a>
Kotlin supports easy implementation of the delegation pattern on the native level without any boilerplate code.

```kotlin
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print()
}
```

### Delegated properties <a name="delegated-properties"></a>
Delegated properties in Kotlin allow the definition of custom getters and setters for a property that can be delegated to another object, such as the lazy initialization of a property.

A lazy variable is initialized only when it is first accessed.
```kotlin
val myLazyVar: String by lazy {
    // Perform some expensive operation to initialize the variable
    "Hello World"
}
// The variable is not initialized until it is first accessed
println(myLazyVar) // Prints "Hello World"
```

## Other Topics <a name="other-topics"></a>

### Destructuring declarations <a name="destructuring-declarations"></a>
Destructuring declarations in Kotlin allow you to break down objects into individual variables in a single line of code.

```kotlin
 val person=Person("Ali",24)
 val (name, age) = person
```
### Reflection <a name="reflection"></a>
Reflection is a set of language and library features that allows you to introspect the structure of your program at runtime. 

This is a example:
```kotlin

  // Obtain a Class object for the String class
    val stringClass = String::class.java

    // Get the fields of the String class and print their names
    val fields = stringClass.declaredFields
    for (field in fields) {
        println(field.name)
    }

    // Get the methods of the String class and print their names
    val methods = stringClass.declaredMethods
    for (method in methods) {
        println(method.name)
    }

```
### Annotations <a name="annotations"></a>
Annotations in Kotlin are special labels that can be applied to declarations such as classes, functions, and properties to provide additional information or metadata about the declaration at compile-time and runtime.
This is a example:
```kotlin
@Deprecated("Use newMethod() instead", ReplaceWith("newMethod()"))
fun oldMethod() {
    // ...
}
```

### Packages and imports <a name="packages-and-imports"></a>
Packages are used to group related classes, functions, and other declarations together. Imports are used to make declarations from other packages accessible within your current file.

```kotlin
package com.example.models

class Person(val name: String, val age: Int) {
    // class implementation
}
```
```kotlin
import com.example.models.Person

fun main() {
    val person = Person("Ali", 24)
    println("Name: ${person.name}, Age: ${person.age}")
}
```

### Null safety <a name="null-safety"></a>

Kotlin has null safety, which helps prevent null pointer exceptions. Kotlin provides operators to work with nullable types, including safe call, elvis, and not-null assertion operators. These features help developers write more reliable code and avoid null pointer exceptions.

```kotlin

    var nullableStr: String? = null
    var nonNullStr: String = "Hello"

    // safe call operator
    println(nullableStr?.length) // prints null

    // elvis operator
    val len = nullableStr?.length ?: -1
    println(len) // prints -1

    // not-null assertion operator
    // throws null pointer exceptions because nullableStr is null
    println(nullableStr!!.length)

    // this would not compile because nonNullStr is not nullable
    // nonNullStr = null

```  
### Equality <a name="equality"></a>

In Kotlin there are two types of equality:

- Structural equality (== - a check for equals())

- Referential equality (=== - two references point to the same object)

```kotlin
data class Person(val name:String,val age:Int)

val person1=Person("Ali",24)
val person2=Person("Reza",27)
var person3=Person("Ali",24)

print(person1==person2) // false
print(person1!=person2) // true
print(person1===person2) // false
print(person1==person3) // true
print(person1===person3) // flase
print(person1!==person3) // true

person3=person1

print(person1===person3) // true

```
- The == operator in Kotlin is equivalent to calling the equals() method.
- Data classes generate an equals() method based on their properties, but regular classes do not.
- To compare objects for equality based on their contents, you need to override the equals() method for regular classes.
```kotlin
class Test{
    var name:String=""
    override fun equals(other: Any?): Boolean {
        return this.name==(other as Test).name
    }
}
```
Please for more detaile read <a href="https://kotlinlang.org/docs/equality.html">doc</a>.

### Comparable <a name="comparable"></a>
You can compare objects using the Comparable interface. This interface defines a compareTo method that compares the current object with another object and returns an integer value that indicates the order of the objects.

```kotlin
data class Person(val name: String, val age: Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age.compareTo(other.age)
    }
}
```
```kotlin
val person1 = Person("Ali", 24)
val person2 = Person("Reza", 30)

if (person1 < person2) {
    println("${person1.name} is younger than ${person2.name}")
} else {
    println("${person1.name} is older than ${person2.name}")
}
```
When you use the sorted() or sort() function to sort a list of objects, Kotlin uses the compareTo() method of the objects to determine their natural order. If the objects in the list do not implement the Comparable interface, you will get a compile-time error.
```kotlin
val people = listOf(
    Person("Ali", 24),
    Person("Reza", 40),
    Person("Shabnam", 23)
)
val sortedPeople = people.sorted()
println(sortedPeople) // [Person(name=Shabnam, age=23), Person(name=Ali, age=24), Person(name=Reza, age=40)]
```
### Regex <a name="regex"></a>

Regex, short for regular expression, is a sequence of characters that forms a pattern used to match and manipulate text.

Regex Basics

- `.`	Matches any character except newline.
- `^` Matches the start of a string, or start of line in multi-line pattern.
- `\A` Matches the start of a string.
- `$` Matches the end of a string, or end of line in multi-line pattern.
- `\Z` Matches the end of a string.
- `\b` Matches a word boundary.
- `\B` Matches a position that is not a word boundary.
- `\d` Matches a digit (0-9).
- `\D` Matches a non-digit.
- `\w` Matches a word character (letter, digit, or underscore).
- `\W` Matches a non-word character.
- `\s` Matches a whitespace character (space, tab, newline, etc.).
- `\S` Matches a non-whitespace character.
- `()` Groups
- `[]` Matches any character inside the square brackets.
- `[^]` Matches any character not inside the square brackets.
- `*`	Matches 0 or more of the preceding element.
- `+`	Matches 1 or more of the preceding element.
- `?`	Matches 0 or 1 of the preceding element.
- `{n}`	Matches exactly n occurrences of the preceding element.
- `{n,}`	Matches n or more occurrences of the preceding element.
- `{n,m}`	Matches between n and m occurrences of the preceding element.

Kotlin provides several functions for working with regular expressions, including:
`matches`, `find`, `findAll`, `replace`, `split` and etc.

This is a simple example:
```kotlin
    val phoneNumber="9112233445"
    val phoneNumber2="9178"
    val phoneNumber3="93abc"
    val regex = Regex("^\\d{10}$")
    println(regex.matches(phoneNumber)) // true
    println(regex.matches(phoneNumber2)) // false
    println(regex.matches(phoneNumber3)) // false
```
