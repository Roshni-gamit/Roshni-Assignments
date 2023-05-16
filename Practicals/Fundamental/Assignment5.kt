package Practicals.Fundamental

fun main()
{

    var amount = 2861

      var notes = amount / 2000
      amount -=notes*2000
    println(" 2000:$notes  remaining amount :$amount")

    notes = amount / 500
    amount -=notes*500
    println(" 500:$notes  remaining amount :$amount")


     notes = amount / 200
    amount -=notes*200
    println(" 200:$notes  remaining amount :$amount")


    notes = amount / 100
    amount -=notes*100
    println(" 100:$notes  remaining amount :$amount")

    notes = amount / 50
    amount -=notes*50
    println(" 50:$notes  remaining amount :$amount")

    notes = amount / 20
    amount -=notes*20
    println(" 20:$notes  remaining amount :$amount")

    notes = amount / 10
    amount -=notes*10
    println(" 10:$notes  remaining amount :$amount")

    notes = amount / 5
    amount -=notes*5
    println(" 5:$notes  remaining amount :$amount")

    notes = amount / 2
    amount -=notes*2
    println(" 2:$notes  remaining amount :$amount")


    notes = amount / 1
    amount -=notes*1
    println(" 1:$notes  remaining amount :$amount")

}