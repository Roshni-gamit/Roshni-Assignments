package Practicals.Functions

fun main() {
    var num1 =10
    var num2 = 50


    while (num1< num2){

        if (PrimeNumber(num1))
            print(num1.toString()+ " ")
        ++num1
    }
}


fun PrimeNumber(num:Int):Boolean{
    var flag = true
    for (i in 2..num /2)
    {
        if(num % i ==0)
        {
            flag= false
        break

    }
}
          return flag
}