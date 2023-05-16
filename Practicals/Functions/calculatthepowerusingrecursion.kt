package Practicals.Functions

fun main() {

    println("Enter A number:")
    var number = readLine()!!.toInt()

    var powerRaised = 4
    var result = power(number , powerRaised)

    println("$number^$powerRaised = $result")
}

fun power(number:Int , powerRaised:Int):Int {
    if (powerRaised != 0)
        return  number*power(number ,powerRaised - 1)
    else
        return  1
}