package com.example.firstkotlin

fun main(){
//    simple for loop
    for (i in 1..10){
        println(i)
    }
//    list defination

val students = listOf("Ahmed", "Hanan", "Saber")

    for(student in students){
        println(student)
    }
for ((index, student) in students.withIndex()){
    println("the index of the student is ${index} and the name is ${student}")
}

//    while loop
var count =5
while (count >0){
println(count)
count--
}
//do while
do{
    println(count)
    count --
}while(count>0)

//    use break

while (count>5){
if (count%2==0) break
count --
 println(count)

}
}