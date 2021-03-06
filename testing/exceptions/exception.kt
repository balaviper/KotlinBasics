package com.example.kotlinbasics.test.testing.exceptions

import java.lang.Exception

private class InvalidAgeException( // custom exception
    private val age: Int
) : Exception() {
    override fun getLocalizedMessage(): String {
        return "Entered Age $age is invalid, Age must less than 60"
    }
}

private class InvalidPasswordException(
    private val password: String
) : Exception() {
    override fun getLocalizedMessage(): String {
        return "Your entered password $password, is not satisfying criteria"
    }
}

private fun demo1() {
    val age = readLine()?.toInt() ?: 0 // if readLine is null return 0
    // sdlsfjsdlfj
    //a;fjsdlf
    //sd;l;slgk

    if (age > 60)
        throw InvalidAgeException(age)
}

private fun demo2() {
    println("Enter Age")
    readLine()?.let {
        if (it.toInt() > 60)
            throw Exception("something unwanted happened")
        else println("its good")
    }

    println("Enter Password (No. $ % ^ &)")
    val pass = readLine()
    pass?.let {
        if (it.contains("$")) {
            throw InvalidPasswordException(it)
        } else println("its good")
    }
}

private fun demo3() {
    try {
        val age = readLine()?.toInt()
    } catch (e: Exception) {
        println(e)
        val age = 0
    } finally {
        println("Final block")
    }
}

private fun demo4() {
    println("Enter age")
    val age = try {
        readLine()?.toInt()
    } catch (e: Exception) {
        0
    }
    println("Age = $age")
}

fun main() {
    demo4()
}