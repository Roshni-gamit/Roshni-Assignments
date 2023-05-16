package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {

    println("Enter a Number:")
    var number = readLine()!!.toInt()

    var factorial = 1
    do {
        factorial *= number
        number--
    }while(number > 0)
    println("Factorial is $factorial")
}