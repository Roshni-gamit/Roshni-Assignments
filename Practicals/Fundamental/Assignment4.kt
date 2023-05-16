package Practicals.Fundamental

fun main()
{

    //write a C program to convert a given integer (in days) to years, months and days,
    // assumes that all months have 30 days and all years have 365 days.

    var Numberofday  = readLine()!!.toInt()

    print("Enter the number of days: $Numberofday")

    //var Num = readLine()!!.toInt()

    var years = Numberofday/365
      Numberofday = Numberofday - (365*years)

    var month: Int = Numberofday / 30

    var days: Int = Numberofday - month *30


    println("No. of years: $years")

    println("No. of weeks: $month")

    println("No. of days: $days")
}