package Practicals.Fundamental

fun main() {
          // Write a C program to convert specified days into years, weeks and days.

    var numberofday = 1329
    print("Enter the number of days: $numberofday")


    // Converts days to years, weeks and days

    var years = numberofday/365
    var weeks = (numberofday % 365)/7
    var days = numberofday- ((years*365) + (weeks*7))


    println("No. of years: $years")

    println("No. of weeks: $weeks")

    println("No. of days: $days")



}