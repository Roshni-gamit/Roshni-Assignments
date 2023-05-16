package Practicals.Fundamental//to swap two numbers. (using third variable)

fun main() {

    var a = 5
    var b = 4

    println("First value define as :$a ")
    println("Second value is define as :$b")

    val c = a
    a = b
    b = c

    println("After swapping")
    println("First value =$a")
    println("Second value = $b")


    println ("to swap two numbers. (without third variable)")


    println("First value define as :$a ")
    println("Second value is define as :$b")

    a = a - b
    b = a +  b
    a = b - a

    println("After swapping")
    println("First value =$a")
    println("Second value = $b")

}