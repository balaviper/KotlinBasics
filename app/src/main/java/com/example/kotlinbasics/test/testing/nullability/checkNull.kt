package com.example.kotlinbasics.test.testing.nullability

import java.util.*

private fun demo2() {
    var dt: Array<String>? = null

    if (System.currentTimeMillis() > 5988) { // random condition
        dt = arrayOf("sdlkfjsldkf", "slkfkdsdklf", "dslfjslkdfj")
    }

    val ln = if (dt != null) dt.size else -3

    // If the expression to the left of ?: is not null,
    // the Elvis operator returns it, otherwise
    // it returns the expression to the right.
    val ln1 = dt?.size ?: -1 // ?: is elvis operator , kotlins way

    println("Length is ${ln}")
    println("Length is ${ln1}")
}

fun main() {
    demo2()
}