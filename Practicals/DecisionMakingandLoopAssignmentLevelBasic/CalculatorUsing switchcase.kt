package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {


    println("Enter  a num1:")
    var num1 = readLine()!!.toInt()
    println("Enter a num2 :")
    var num2 = readLine()!!.toInt()
    println(""" 1. addition
                2. subtraction
                3. multiplication
                 4. division :""".trimIndent())


    print("Enter a choice :")
    var result = readLine()!!.toInt()


    when(result)
    {
        1 -> println("addition : ${num1+num2}")
        2 -> println("subtraction : ${num1-num2}")
        3 -> println("multiplication : ${num1*num2}")
        4 -> {
            var result = num1/num2.toFloat()
            println("division : $result")
        }
        else -> println("Invalid input")
    }
}