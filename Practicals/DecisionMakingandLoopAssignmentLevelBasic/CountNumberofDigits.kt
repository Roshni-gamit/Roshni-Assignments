package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {

    var count=0
    var num=19385


    while (num != 0){
        num /= 10
        ++count
    }
    println("Number Of Digit:$count")
}