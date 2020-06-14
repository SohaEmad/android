package com.example.firstkotlin

//specifying the data type is optional

// immutable variable value set only once
val number: Int =42
// a variable
var count: Int=0

// Long 64bits
val myLong: Long= 30000L
//    8bits
val MyByte: Byte= 127
//    16 bits
val MyShort: Short = 327

//    Double 64 bit
val MyDouble: Double=98.6
//    Float 32bit should add f at the end
val MyFloat: Float = 12.2F

//cast numbers from type to another
val asInt = MyDouble.toInt()
val asFloat = myLong.toFloat()
//    can use underscore with big numbers
val maxInt = 2_111_333

//    Kotline support hex , binary and Long values

val hexValue = 0xfec1
val binaryVal= 0b101010
val LongVal = 19834L

//chars variable

val letter: Char ='S'
val tab = '\t'
val infinity = '\u221E'

//Boolean

var x= false
val big = 1_000_000
val small = 2

//Logic operations  or ||  , and &&  and not !  as any usual language

//strings
val greetings = "hello world "


fun main(){
println("letter= $letter")
println("tabbed $tab over ")
    println("infinity $infinity ")

    val line = 10.toChar()
    println("line $line the next ")
println("boolean expression ${big > small}")

    val dataString= "I have this long value \$$LongVal her"

println(dataString)



}