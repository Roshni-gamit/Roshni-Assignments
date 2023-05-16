package Practicals.Array



fun main() {


    var num= doubleArrayOf(10.5,30.15,45.00)
    var sum = 0.0


    for (i in num){

        sum += i

    }

    var avg = sum / num.size
    println("The avg is :%.2f".format(avg))
}