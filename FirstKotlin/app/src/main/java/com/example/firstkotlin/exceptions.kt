package com.example.firstkotlin


data class Person(var firstName: String , var lastName: String)
fun main(){

//    this is a nullable varaible
    val person: Person? = null

    val greetings: String? =  null // "hi there "

    if (greetings != null){
        println("the value is ${greetings}")
    }
println("the string length = ${greetings?.length}")

//    if the value is null use the right side
    val len= greetings?.length?:0
    println(len)

//   use examplilation mark as we are so sure and want avoid kotli warnings
// this cause runtime exception
val badlen = greetings!!.length

//    cast using as

    val castedgreet: String? = greetings as? String
}
