package Practicals.Functions

fun main() {

print("Enter a number1:")
    var num1 = readLine()!!.toInt()
    println(" Enter a Number2:")
    var num2 = readLine()!!.toInt()
    println("Enter a number3:")
    var num3 = readLine()!!.toInt()

    if(num1 >= num2 && num1>=num3)
        println(" $num1 is the Maxvalue.")
    else if(num2 >= num1 && num2 >= num3)
        println("$num2 is the MaxValue.")
    else
        println("$num3 is the MaxValue.")

}