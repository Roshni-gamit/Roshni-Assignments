package Practicals.Fundamental

fun main(){
    var a =25
    var b = 4

    println("Quotient of $a and $b = ${a/b}")
    println("Quotient of $a and $b = ${a%b}")


    //  WAP to Calculate Total, Average, and Percentage of Five Subjects.



    print("Enter the marks of five subject :")
    var English = readLine()!!.toInt()
    var Computer = readLine()!!.toInt()
    var Chemestry = readLine()!!.toInt()
    var Physics = readLine()!!.toInt()
    var Maths = readLine()!!.toInt()


    var Total =( English+Computer+Chemestry+Physics+Maths )
    var Average = (Total.toFloat()/5)
    var Percentage = Total/500*100


    println("Total marks : $Total")
    println("Average marks : $Average")
    println("Percentage : $Percentage")

}