package com.example.kotlinbasics.test.testing.generics

import java.util.Date

private class Test<in T, out U>(
    private val t : T,
    private var u : U,
    //private val v : V
) {
//    fun getDt() : T {
//        return t
//    }

    fun cal(t : T) : U{
        t as U
        return t
    }
    fun getDu() : U {
        return u
    }
}

fun main() {
    val box1: Test<Int, Double> = Test(10, 56.9)
    println(box1.getDu())
    val box2 = Test<String, Boolean>("abc", true)
    val box3 = Test('c', Date())
}