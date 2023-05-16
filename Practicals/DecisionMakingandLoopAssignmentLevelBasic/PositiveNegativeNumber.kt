package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {

    println("Enter Number :")
    var Number = readLine()!!.toInt()


    if(Number < 0) {
        println("$Number is negative number.")
    }
    else if(Number > 0){
        println("$Number is positive number.")

    }
    else
    {
        println("$Number is 0")
    }

}