package Practicals.Functions

fun main(args: Array<String>) {

    var s: String? = "LearningKotlin"
    println(s)
    if (s != null) {
        println("String of length ${s.length}")
    } else {
        println("Null string")
    }

    s = null
    println(s)
    if (s != null) {
        println("String of length ${s.length}")
    } else {
        println("Null String")
    }
}