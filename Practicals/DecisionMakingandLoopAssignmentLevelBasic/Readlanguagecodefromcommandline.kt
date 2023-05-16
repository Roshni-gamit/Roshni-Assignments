package Practicals.DecisionMakingandLoopAssignmentLevelBasic

fun main(args: Array<String>) {
    var language = if (args.size == 0)"EN" else args[0]
    println(when(language){

        "EN"->"Hello"
        "FR"->"Salut"
        "IT"->"Ciao"
        else->"Sorry,$language"
    })
}