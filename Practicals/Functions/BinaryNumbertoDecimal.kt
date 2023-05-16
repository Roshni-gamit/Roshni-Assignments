package Practicals.Functions

fun main() {

    println(" Enter a number")
    var num = readLine()!!.toLong()

    var decimal = convertBinaryToDecimal(num)
    println(" $num isbinary = $decimal is decimal")
}
fun  convertBinaryToDecimal(num: Long): Int
{
    var num = num
    var decimalNumber = 0
    var i =0
    var reminder: Long

    while (num.toInt() != 0)
    {
        reminder = num % 10
        num /= 10
        decimalNumber +=(reminder * Math.pow(2.0 , i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}