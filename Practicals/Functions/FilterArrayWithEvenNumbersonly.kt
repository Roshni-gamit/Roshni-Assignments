package Practicals.Functions

fun main() {
    var myList = listOf(1, 4, 8, 5, 6, 9, 12, 10, 33)
    var filteredList = myList.filter { x -> x % 2 == 0 }
    println("Original List : ${myList}")
    println("Filtered List : ${filteredList}")
}