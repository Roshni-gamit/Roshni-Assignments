package Practicals.Fundamental

fun main() {
    val str = "Gujrat Technological university."
    val ch = 'e'
    var frequency = 0

    for (i in 0..str.length - 1) {
        if (ch == str[i]) {
            ++frequency
        }
    }

    println("Frequency of $ch = $frequency")

}