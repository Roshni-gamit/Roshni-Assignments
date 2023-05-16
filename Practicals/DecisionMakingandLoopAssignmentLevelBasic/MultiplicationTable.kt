package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {

    println("Enter Multiplication Table Of:")
    var num1 = readLine()!!.toInt()

    for(i in 1..10) {
        var num2 = num1 * i
        println("$num1 *$i = $num2")
    }

}