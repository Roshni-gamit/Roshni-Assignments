package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main() {
    var language = arrayOf("Java", "Kotlin" , "Dart", "PHP" , "Python")

    for (i  in 0..3){
        for(j in i + 1..4){

            if(language[i].compareTo(language[j]) > 0)
            {
                var temp = language[i]
                language[i] = language[j]
                language[j] = temp
            }
        }
    }

    println(" In Dictionary Order:")
    for(i in 0..4)
    {
        println(language[i])
    }
}