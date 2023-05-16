package Practicals.Fundamental

fun main() {

    //Write a C program to convert a given integer (in seconds) to hours, minutes and seconds.


    var Sec = 25300
    println("Input Seconds: $Sec")

    var Hours = (Sec/3600)
    var Minutes = (Sec-(3600*Hours))/60
    var Second = (Sec-(3600*Hours)-(Minutes*60))


    println("H:M:S: $Hours:$Minutes:$Second")
}