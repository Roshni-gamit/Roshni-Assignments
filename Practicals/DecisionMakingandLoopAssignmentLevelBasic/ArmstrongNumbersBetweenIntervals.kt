package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {
    var num1 = 999
    var num2 = 9999

    for (number in num1 +1 ..num2 -1 ){

        var digits=0
        var result = 0
        var originalNumber = number

        while (originalNumber != 0)
        {
            originalNumber /= 10
            ++digits
        }

        originalNumber = number

        while (originalNumber !=0)
        {
            var reminder = originalNumber % 10
            result += Math.pow(reminder.toDouble(),digits.toDouble()).toInt()
            originalNumber /= 10
        }
        if(result == number)
        print("  $number")
    }
}