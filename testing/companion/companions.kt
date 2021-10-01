package com.example.kotlinbasics.test.testing.companion

class DbConnector{
    companion object{
        internal val url = "http://abc.com"
        private val username = "user"
        private val password = "pass"

       fun getPass(): String = password

    }
    fun dis(): String { println(username)
        return getPass()
    }
}

fun main() {
    val db = DbConnector()
    println(db.dis())
    println("url = ${DbConnector.getPass()}")
    println("url = ${DbConnector.url}")
}