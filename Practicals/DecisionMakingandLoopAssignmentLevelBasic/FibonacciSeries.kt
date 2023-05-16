package Practicals.DecisionMakingandLoopAssignmentLevelBasic


fun main() {


    var n = 10
    var num1= 0
    var num2 = 1

    println("Enter $n terms:")
     for(i in 1..n){
         print(" $num1 + ")

         var sum = num1 + num2
         num1 = num2
         num2= sum
     }


}