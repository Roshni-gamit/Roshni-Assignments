package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {
    var Sentence = "I Am Learning Kotlin."
    var vowels = 0
    var consonants = 0


    Sentence = Sentence.toLowerCase()
    for (i in 0..Sentence.length - 1) {
        val ch = Sentence[i]
        if (ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
            ++vowels
        } else if (ch in 'a'..'z') {
            ++consonants
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")

}