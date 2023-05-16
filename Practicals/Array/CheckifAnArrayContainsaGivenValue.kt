package Practicals.Array

fun main() {

    var num = intArrayOf(1,2,3,4,5,7,9,11)

    println("Enter a number:")
    var num1 = readLine()!!.toInt()

    var found = false

    for (i in num)
    {
        if (i == num1){
            found = true
            break
        }
    }

    if (found)
        println("$num1 is found.")
        else
            println("$num1 is not found.")

}