package Practicals.Functions

fun main() {

    println(" Enter a Number:")
    var decimal = readLine()!!.toInt()

    var octal = converDecimalToOctal(decimal)

    println("$decimal in decimal = $octal in octal ")
}



fun converDecimalToOctal(decimal:Int):Int{
  var decimal = decimal
    var octalNumber = 0
    var i =1

    while (decimal != 0){

        octalNumber += decimal  % 8 * i
        decimal /= 8
        i *= 10
    }
        return octalNumber



}















