package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {


       println(" Enter a number:")
       var num = readLine()!!.toInt()
        var flag = false

    for(i in 2..num / 2){
        if(num % i==0){
            flag = true
            break
        }
    }
       if (!flag)
           println("$num is prime number.")
       else
           println("$num is not a prime number.")

}
