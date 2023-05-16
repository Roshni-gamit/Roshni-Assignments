package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {

    println(" Enter the Number:")
    var num = readLine()!!.toInt()

    var Number :Int
    var reminder : Int
    var result = 0

    Number = num


    while (Number !=0){

        reminder = Number % 10
        result += Math.pow(reminder.toDouble(),1.0 ).toInt()
        Number /= 10
    }

    if(result == num)
        println("$num is an armstrong number.")
    else
        println("$num is not an armstrong number.")
}