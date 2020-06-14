package com.example.firstkotlin

//string builder class for string manupalation  optimization
val StringVal = "Hello"
val  StringVal2 = "bye"

fun main(){
   println("${StringVal.length}")

//    get a certain character
//    use index not recommended
var value_2 = StringVal.get(2)
    value_2 = StringVal[1]
//compare two strings values return 0, 1, -1
 println("${StringVal.compareTo(StringVal2)}")

//    substrings

    val sub = StringVal.subSequence(3,4)
    println("$sub")
// for loop with strings
for (value in StringVal){
    println(value)
}
//    use keep formate
val formateString = """
   this is the string data type 
    class in the first tutorials 
"""
print(formateString)
}

