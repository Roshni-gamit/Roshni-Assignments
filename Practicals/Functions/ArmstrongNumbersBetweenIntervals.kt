package Practicals.Functions

fun main() {
    var num1 = 999
    var num2 = 99999


    for (number in num1 +1 ..num2 -1){
        if (checkArmstrong(number))
            print("$number\t")
    }
}

fun checkArmstrong(num: Int): Boolean
{
     var digits =0
    var result = 0
    var originalNmber = num

    while (originalNmber != 0){
        originalNmber /= 10
        ++digits
    }

    originalNmber = num


    while (originalNmber != 0)
    {
        var reminder  = originalNmber % 10
        result += Math.pow(reminder.toDouble(),digits.toDouble()).toInt()
        originalNmber /= 10
    }
    if (result==num)

        return true

        return false

}