package com.example.kotlinbasics.test.testing.classObj

private data class info(
    val id : Int = 101,
    val name : String = "Bala",
    val status : Boolean = true
) //cant access private data

fun main() {
    var ob = info()
    println(ob.toString())
    println(ob.id)
}