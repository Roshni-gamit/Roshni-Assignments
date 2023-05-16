package Practicals.Functions

fun main() {

    print(" Enter a Number:")
    var num = readLine()!!.toInt()
    var factorial = multiplayNumbers(num)
    println(" Factorial of $num = $factorial")
}

fun multiplayNumbers(num :Int):Long
{
    if(num >= 1)
        return  num * multiplayNumbers(num - 1)
    else
        return  1
}