package com.example.firstkotlin

import java.util.*

fun main(args: Array<String>) {
    if(args.any()){
        println("the string equal = ${args[0]}")
    }
    for(arg in args){
        println(arg)
    }
//    recommended tools/ plugins
//    https://github.com/Kotlin/kotlinx.cli

//    input from user

println("enter the number ")
    val txt = readLine() ?:""
    println("you entered the value $txt and the length is ${txt.length}")

    // parse to integer

    val intvalue: Int = txt.toIntOrNull()?:0

    println(intvalue)

    //parse to double

    val doublevalue: Double = txt.toDoubleOrNull()?:0.0

    println(doublevalue)
scanner()
}
fun scanner(){
    //throw exception for improper input
    val scan = Scanner(System.`in`)
    println("ENter num ")
    val num1= scan.nextInt()
    println("ENter num ")
    val num2= scan.nextDouble()
}