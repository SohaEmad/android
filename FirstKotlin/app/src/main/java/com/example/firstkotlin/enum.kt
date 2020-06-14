package com.example.firstkotlin

enum class Suit{
    Club, Diamond, Heart , Spade
}

fun main(){
    val card = Suit.Spade

    // take all cases in consideration no need for else
    val y = when(card){
        Suit.Club, Suit.Spade -> println("black card")
        Suit.Diamond , Suit.Heart -> println("red")

    }

    // here we need else
var data = "first name "

    val dataPostfix= when(data){
       "first name " -> "hello"
        "last name"-> "bye"
        else->"not known "
    }
}