package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {


    var num1 =81
    var num2 =153

    while(num1!=num2){

        if(num1>num2)
            num1 -= num2
        else
            num2 -= num1
    }
    print("G.C.D of two numbers = $num1")
}