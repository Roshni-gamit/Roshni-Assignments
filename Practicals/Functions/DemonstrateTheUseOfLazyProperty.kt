package Practicals.Functions

class Demo {
    val myName: String by lazy {
        println("Welcome to Lazy declaration");
        "www.tutorialspoint.com"
    }
}


fun main() {
    var obj=Demo();
    println(obj.myName);
    println("Second time call to the same object--"+obj.myName);
}