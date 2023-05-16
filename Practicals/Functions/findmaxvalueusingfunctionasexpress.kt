package Practicals.Functions

fun main() {
    var list = listOf<Int>(10,3,2,7,5,9)

    var max =findMax(list)
    println(max)
}

fun findMax(list: List<Int>): Int?
{
var max = Int.MIN_VALUE
    for (i in list)
    {
        max = max.coerceAtLeast(i)
    }
    return  max
}