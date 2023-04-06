fun main(args: Array<String>) {
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
}
