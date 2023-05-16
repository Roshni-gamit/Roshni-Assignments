package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {

    print("Enter the value of number1:")
    var number1 = readLine()!!.toInt()

    print("Enter the value of number2:")
    var number2 = readLine()!!.toInt()
    var lcm= 0

    lcm = if (number1 > number2) number1 else number2

    while (true) {
        if (lcm % number1 == 0 && lcm % number2 == 0) {
            println("The LCM of $number1 and $number2 is $lcm.")
            break
        }
        ++lcm
    }
}