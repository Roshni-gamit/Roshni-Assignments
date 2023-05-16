package Practicals.Functions

fun main() {
    println(" Enetr a Number1:")
    var num1 = readLine()!!.toInt()

    println(" Enter a Number2:")
    var num2 = readLine()!!.toInt()

    var ABC = ABC(num1, num2)


    println(" G.C.D of $num1 and $num2 is $ABC")
}

fun ABC(num1 : Int , num2: Int):Int

{
    if(num2 != 0)
        return ABC(num2,num1 % num2)
    else
        return  num1
}
