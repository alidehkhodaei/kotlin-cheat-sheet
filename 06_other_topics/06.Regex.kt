fun main() {
    val phoneNumber="9112233445"
    val phoneNumber2="9178"
    val phoneNumber3="93abc"
    val regex = Regex("^\\d{10}$")
    println(regex.matches(phoneNumber)) // true
    println(regex.matches(phoneNumber2)) // false
    println(regex.matches(phoneNumber3)) // false
}
    
