package com.example.firstkotlin

import java.io.File

fun main(){

//    read and write to/from file
    val res ="./resources"
    val pets= "pets.txt"
    val pFile = File("${res}/$pets")

    pFile.forEachLine { println(it) }

val writeFile = File("${res}/out.txt")
    writeFile.writeText("I am new to kotlin but it sounds fun ")

//    check existance
val exist = pFile.exists()
    println(exist)
}