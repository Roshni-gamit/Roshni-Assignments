package Practicals.Functions

import kotlin.properties.Delegates

fun main() {
    var observed = false
    var max: Int by Delegates.observable(0) { property, oldValue, newValue ->
        observed = true
    }

    println(max)
    println("observed is ${observed}") // false

    max = 10
    println(max)
    println("observed is ${observed}") // true
}
