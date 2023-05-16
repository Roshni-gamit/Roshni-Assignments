package Practicals.Functions

fun main() {

    println(" Enter the number:")
    var number = readLine()!!.toInt()
    var sum = addNumbers(number)
    println(" Sum = $sum")
}

fun addNumbers(num : Int): Int
{
    if (num != 0)
        return  num + addNumbers(num -1 )
    else
        return num
}