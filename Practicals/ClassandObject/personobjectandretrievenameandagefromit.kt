package Practicals.ClassandObject

data class Data(val name:String,val age:Int)


fun sendData():Data{
    return Data("Roshni",30)
}

fun main(){
    val obj = sendData()

    println("Name is ${obj.name}")
    println("Age is ${obj.age}")


    val (name,age) = sendData()
    println("Name is $name")
    println("Age is $age")

}