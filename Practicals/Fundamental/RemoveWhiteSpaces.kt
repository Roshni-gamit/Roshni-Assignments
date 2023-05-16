package Practicals.Fundamental

fun main() {
    var sentence = "M   y Nam e is Ro  sh  ni."
    println("Original sentence: $sentence")

    sentence = sentence.replace("\\s+".toRegex(),"")
    println("New sentence: $sentence")
}