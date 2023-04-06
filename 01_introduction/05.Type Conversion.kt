package `01_introduction`

fun main() {
    // Type Conversion

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

}
