package Practicals.Fundamental

fun main()
{
    //WAP to find out simple interest. SI = p*r*t/100

    println("Enter principal amount : ")
    var p= readLine()!!.toInt()

    println("Enter rate of interest : ")
    var r= readLine()!!.toInt()

    println("Enter number of years : ")
    var t= readLine()!!.toInt()

    var SI:Int = (p*t*r)/100

    println("Simple interest : "+SI)



    // to compute the perimeter and area of a rectangle with a length of 7 inches. and width of 5 inches.

    var length = 7
    var width = 5

    //println("The sides of the rectangle are defined as $length, $width, $length, $width")
    val Result = 2 * (length + width)
    println("Perimeter of rectangle is: $Result")
    val Result2 = length*width
    println("Area of rectangle is : $Result2")

println("program to compute the perimeter and area of a circle with a given radius. PI- 3.14 (constant)")

    var radius = 5
    println("The radius of the circle is defined as $radius")
    var P1 = (2 * 3.14 * radius)
    println("The perimeter of the circle is: $P1")
    var P2 =(3.14*radius*radius)
    println("The area of circle is :$P2")



}