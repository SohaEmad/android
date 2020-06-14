package com.example.firstkotlin

fun main(){

    val big = 1000
    val small= 1

    val max = if(big>small) big else small

//    set values range bu when and  in experession

    val age = 30
    val decide = when(age){
        in 0..18 -> "young"
    in 19..40-> "adult"
        3,4->"child "
        1->"toddler"
        else->"senior"
    }
    println("the decision is ${decide}")
val funreturn = anotherFun()
print(funreturn)


//    if else is as usuall
val output:Any = if(number >180 ){
    "first output"
}else if (number > 80 ){
1}
    else{
    0
    }
println(output)

    // outbout boolen doesn't need if statment

    val isgreat = big >100
}

fun anotherFun(){
    println("no return ")
}