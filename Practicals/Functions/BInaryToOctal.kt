package Practicals.Functions

fun main() {

    println("Enter a number:")
    var binary = readLine()!!.toLong()

    var octal = converBinaryToOctal(binary)

    println(" $binary in binary = $octal in octal")
}

fun converBinaryToOctal(binaryNumber: Long):Long
{
var binaryNumber = binaryNumber
    var octalNumber = readLine()!!.toLong()
    var decimalNumber = 0
    var i = 0

    while (binaryNumber.toInt() != 0){


        decimalNumber += (binaryNumber % 10 * Math.pow(2.0 , i.toDouble())).toInt()
        ++i
        binaryNumber /=10

    }

    i = 1

    while (decimalNumber != 0)
    {
        octalNumber += decimalNumber % 8 * i
        decimalNumber /= 8
        i *= 10
    }
return octalNumber

}