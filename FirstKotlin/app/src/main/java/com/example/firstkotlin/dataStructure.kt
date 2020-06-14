package com.example.firstkotlin

import android.os.Build
import androidx.annotation.RequiresApi


//define a calss
data class Student(val FirstNAme: String , val grade:Int)
@RequiresApi(Build.VERSION_CODES.N)
fun main(){
//    array doesn't need to be the same type
//    the intialization define the possible values to insert later

val arrayofThings = arrayOf(1,2,3,"one", "two", "three",Student("Ahmed", 4) )

    arrayofThings[0]= Student("Ahmed", 4)

//can define array type this with be mono type
val students = arrayOf<Student>( Student("Ahmed", 4) ,  Student("Ahmed", 4))

students[1]=  Student("Ahmed", 4)

    for (student in students)
        println(student)


//use array constructor to intialize the array will need index and function or lambda
val arrayConst = Array(5, ::arrayval)
    arrayConst.forEach { println(it) }

    println(arrayConst.size)
    println("the indices is ${arrayConst.indices}")
    println("last index is ${arrayConst.lastIndex}")

//primitive arrays
val intarray = intArrayOf(1,2,3)

    // all collection could be read-only or mutable
//val used to point to the intialized collection
//    var used to point to new collections
//list gurantee order
val names = listOf("hi", "bye", "you ", "the")
    println("first ${names.get(0)}")
    println("first ${names[0]}")

    var subNames = names.subList(1,3)
println(subNames)
    var items = mutableListOf(1,2,4,5,6,7,10,1,3,1)
    items[0] = 1
    items.add(12)
    items.removeAt(3)
    items.remove(1)
    println("the length of the list is ${items.size}")
    println("the value of item is ${items[0]}")

//set and HashSet  dublication is not allowed in set
val setExample = setOf(3,3,3,3)
    println(setExample)
    println("the set size is ${setExample.size}")
    println("does contain 4 ${setExample.contains(4)}")

//    mutable set
val secondSet = mutableSetOf(1,6,7,8,9)
val thirdSet = mutableSetOf(9,8,7,6,1)

    //compare two sets
    println(" ${secondSet.first()== thirdSet.first()}") //false
    println(" ${secondSet== thirdSet}")//true

    //    Hash  set
    val secondHashSet = hashSetOf(1,6,7,8,9)//true
    val thirdHashSet = hashSetOf(9,8,7,6,1)//true

    //compare two sets
    println(" ${secondHashSet.first()== thirdHashSet.first()}")
    println(" ${secondHashSet== thirdHashSet}")

    secondSet.add(6)
    secondHashSet.remove(1)

//Maps  collection of key- value pair unique value key

    val m1= mapOf(1 to "one" , 2 to "two")
    val m2= mapOf(2 to "two" , 1 to "one")

    println(m1 == m2)
    println(m1[2])
    println("${m1.getOrDefault(5, "not available ")}")


    //mutale map

    val car = mutableMapOf("betale " to "old" , "tesla " to "new")
    car["tesla"] = "brand new "
    println("try to remove ${car.remove("truck")}")

    for (key in car.keys){
        println(key)
        println(car.get(key))

    }
    //check key or value existance in map
    println("find key in the map ${"betal" in car}")
    println("find value in the map ${"old" in car.values}")




//main collections operations

    val list = listOf(1,2,2,3,4,5)
    val set = setOf(10, 20 , 30 )
    val map = mapOf(1 to 10 , 2 to 20 , 3 to 30)

//    1- transformation
val tList= list.map { it +2 }
    println(tList)

    val tMap = map.map { Pair(it.key , it.value+2)}.toMap()
    println(tMap)

//    2- filter
//    get only odd numders
val fList = list.filter { it %2 ==1}
    println(fList)

    val fSet = set.filter { it >100 }
    println(fSet.isEmpty())

    println(tList.last{it>2})
//3- sort set is already sorted but we can sort it the other way

println("sort descending ${set.sortedDescending()}")

//    converting

    println(list.toSet())
    println(set.toList())


//    sequence used with vast collection and pipeline function

//    sequence of if you have all the element
//    sequence generator
//            assequence if you have a collection

val mysequence = sequenceOf(1,2,34,4).filter { it>4 }
    println(mysequence.toList())

    val result = (100 until 200).asSequence().filter{ it % 3 == 0 }.first()
    //this will take longer
    val result_map = (100 until 200).filter{ it % 3 == 0 }.first()

println(result)
}

fun arrayval(index: Int): Int{
    return index*5;
}
