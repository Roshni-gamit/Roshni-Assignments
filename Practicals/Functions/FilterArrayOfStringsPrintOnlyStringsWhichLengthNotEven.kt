package Practicals.Functions

import functions.getMessage

fun main() {
    var myList = listOf("abcd", "is" ,"four", "letter", "word", ".")
    var filteredList = myList.filter { x -> x.length == 4 }
    println("Original List : ${myList}")
    println("Filtered List : ${filteredList}")
}





