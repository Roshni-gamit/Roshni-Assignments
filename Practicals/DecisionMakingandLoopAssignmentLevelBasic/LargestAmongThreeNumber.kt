package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {

    var num1 = 55
    var num2 = 30
    var num3 = 70

    if(num1>num2)
    {
        if(num1> num3){
            // num1 is greater
            println("$num1 is greater")
        }else{
            // num3 is greater
            println("$num3 is greater")
        }
    }else{
        // num2 is greater
        if(num2>num3){
            // num2 is greater
            println("$num2 is greater")
        }else{
            // num3 is greater
            println("$num3 is greater")
        }

    }
}