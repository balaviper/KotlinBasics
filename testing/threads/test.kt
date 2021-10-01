package com.example.kotlinbasics.test.testing.threads

import kotlin.concurrent.thread

fun main() {
    println("bala1 ")
    println("bala2 ")
    println("bala3 ")
    thread {
        println("thread 1 ")
        println("thread 2")
    }.run()

    println("bala4 ")
    println("bala5")
}