package Practicals.ClassandObject

data class student(var name:String, var number:Int)

fun main() {
    var R1 = student("Roshni", 2)
    var R2= R1.copy()
    var R3 = R1.copy(number = 5)


    if (R1.equals(R2) == true)
    {
        println("R1 and R2 are equal")
    }
    else
    {
        println("R1 and R2 are not equal")
    }

    if (R1.equals(R3) == true)
    {
        println("R1 and R3 are equal")
    }
    else
    {
        println("R1 and R3 are not equal")
    }
}