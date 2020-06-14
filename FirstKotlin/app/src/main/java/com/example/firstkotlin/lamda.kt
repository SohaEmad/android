package com.example.firstkotlin

fun main(){

    val lam1:(Int , Int)-> Int = {a:Int , b: Int -> a+b}
println("the sum is ${lam1(2,3)}")
    val lam2 = {a:Int , b: Int -> a * b}
    println("the sum is ${lam2(2,3)}")

//    trailing lamda
val list = listOf(1, 2, 3 )
    println(list.filter { it < 7 })

    val greets:String.()-> String ={"what's up ${this}"}
    println("Ahmed".greets())


//    anynomus function better than lamda only in multible return case


//val anynomus = list.filter {fun(a: Int): Boolean {return a < 7}}
//
//    val anynomus2 = list.filter {fun(a) = (a < 7) }


    val agefun = lambda@{
        age:Int  -> if (age >60)
        return@lambda "senior"
        else if (age >21) return@lambda "adult "
        else return@lambda "reqular"
    }


    val agefun2 = fun (age:Int): String{
       if (age >60)
        return "senior"
    else if (age >21) return "adult "
    else return "reqular"
    }


}