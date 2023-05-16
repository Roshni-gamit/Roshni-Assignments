package Practicals.Array

fun main() {
    val num = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    val SD = calculateSD(num)

    System.out.format("Standard Deviation = %.6f", SD)
}

fun calculateSD(num: DoubleArray): Double {
    var sum = 0.0
    var standardDeviation = 0.0

    for (i in num) {
        sum += i
    }

    val mean = sum / 10

    for (j in num) {
        standardDeviation += Math.pow(j - mean, 2.0)
    }

    return Math.sqrt(standardDeviation / 10)
}