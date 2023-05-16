package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main(args: Array<String>) {
    var num = 1

    while(num<=10){
        println("$num")
        num++
    }

    do{

        println("$num")
        num++

    }while(num<=10) // 12<=10

    println("value of num : $num")
}