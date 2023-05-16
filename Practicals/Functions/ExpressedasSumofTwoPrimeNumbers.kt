package Practicals.Functions

fun main() {

    println("Enter the Number:")
    var number = readLine()!!.toInt()
    var flag = false

    for (i in 2..number / 2) {

        if (checkPrime(i)) {
            if (checkPrime(number - i)) {
               // println("\n%d = %d + %d\n", number, i, number - i)
                flag = true
            }
        }
    }

    if (!flag)
        println("$number can not be expressed as the sum of to prime number.")

}


fun checkPrime(num : Int):Boolean {
    var isPrime = true
    for (i in 2..num / 2) {
        if (num % i == 0){
            isPrime = false
        break
    }
}
return isPrime

}