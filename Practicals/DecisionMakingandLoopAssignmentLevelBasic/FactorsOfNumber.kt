package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {
    println("Enter the number:")
    var number = readLine()!!.toInt()

    println("Factor of $number is:")

    for (i in 2..number/2){
        if(number % i == 0)
        {
            println("$i")
        }
    }
}