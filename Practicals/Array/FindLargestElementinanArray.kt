package Practicals.Array

fun main() {

    var num1 = doubleArrayOf(99.95,82.23,45.50,31.00,66.02)
    var largest = num1[0]



    for (i in num1){

        if (largest < i)
            largest = i
    }

    println("Largest element = %.2f".format(largest))
}