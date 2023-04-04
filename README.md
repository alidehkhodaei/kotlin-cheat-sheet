# Kotlin Cheatsheet
Kotlin is a modern, multi-paradigm programming language that runs on the Java Virtual Machine (JVM) and is designed to be more concise and safer than Java. A Kotlin cheat sheet is a quick reference guide that provides a concise summary of the most important Kotlin syntax and features. If you'd like to support me, please give a star to this repository.⭐🙏

![Kotlin logotype](https://github.com/alidehkhodaei/kotlin-cheatsheet/blob/add-cheatsheet/images/kotlin_logotype.jpg)

# Table of Contents


- [Variables](#variables)
  - [Var vs Val](#var-vs-val)
  - [Type Inference](#type-inference)
  - [Type Conversion](#type-conversion)
  - [Lazy and lateinit](#lazy-and-lateinit)
  

## Variables <a name="variables"></a>


### Var vs Val <a name="var-vs-val"></a>
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

Kotlin provides several methods for converting between data types.

```kotlin
val x = "5"
val y = x.toInt() // y is now an Int with value 5

val a = 5
val b = a.toString() // b is now a String with value "5"
```

 Here are some of the most commonly used methods:

| Name | Description     | 
| :-------- | :------- | 
| toByte() | converts a value to Byte type
|toShort() | converts a value to Short type
|toInt()   | converts a value to Int type
|toLong()  | converts a value to Long type
|toFloat() | converts a value to Float type
|toDouble()| converts a value to Double type
|toChar()  | converts a value to Char type
|toString()| converts a value to String type

### Lazy and lateinit  <a name="lazy-and-lateinit"></a>

A "lazy" variable is initialized only when it is first accessed.

```kotlin
val myLazyVar: String by lazy {
    // Perform some expensive operation to initialize the variable
    "Hello World"
}

// The variable is not initialized until it is first accessed
println(myLazyVar) // Prints "Hello World"
```
A "lateinit" variable is used when you know that a variable will be initialized before it is used, but you don't want to assign an initial value at the time of declaration.

```kotlin
lateinit var myLateInitVar: String

// The variable is not initialized yet, so trying to access it will throw an exception
// println(myLateInitVar) // This line would throw a "lateinit property has not been initialized" exception

// Sometime later, the variable is initialized
myLateInitVar = "Hello World"

// Now we can access the variable without an exception
println(myLateInitVar) // Prints "Hello World"
```
