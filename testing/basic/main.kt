package com.basics.kotlin_basics1.basic


//void :: unit ; int :: Int ;;

fun sum(a: Int, b: Int): Int {
    return a + b
}
fun printloops(){
    val items = listOf("apple", "banana", "kiwifruit")
    println("**** for loop ****")
    for(i in 0..10 step 2){
        println("$i ${i*2}")
    }
    println("**** for loop decrement ****")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    println("**** For each with index value****")
    for(i in items.indices){
        println("Item $i")
    }
    println("**** For each with value****")
    for(i in items){
        println("Item $i")
    }

}
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    var x = 70
    val y = 30 // immutable
    println("Bala viper $x")
    println(sum(10,20))
    printloops()
}