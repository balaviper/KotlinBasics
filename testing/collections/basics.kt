package com.example.kotlinbasics.test.testing.collections

import com.basics.kotlin_basics1.typecasting.convert
import java.util.*
import kotlin.collections.HashMap

fun lk() {
    var list = LinkedList<Int>()
    for (i in 0..5) {
        list.add(i)
    }
    list.forEach {
        println(it)
    }
    list.forEach() { // trailing lambda
            el ->
        println(el)
    }
    list.forEach({ el -> println(el) })

    list.forEach(fun(el) {
        println(el)
    })
}

fun list2() {
    val list = listOfNotNull(1, 2, 3, 4, 5, 6, 7)
    val list1 = listOfNotNull( 5, 6, 7, 8,9,10)
    val square = list.map{ it*it }
    val sqd = list.map { it * it }
    val sq = list.map(fun(el): Int {
        return el * el
    })
    val common = list.filter { list1.contains(it) }
    println(list.filter { it > 3 })
    println(list.findLast { it > 40 })
    println(list.maxOrNull() ?: -1)
    println(common)

}
fun tree(){
    val strarr = arrayOf<String>("abc","asd","wef","qf","asf","adv","abc","qf","asf","adv")
    val set = setOf<String>("abc","asd","wef","qf","asf","adv")
    val set1 =strarr.toSet()
    val arr = set.toTypedArray()
    val sorted = TreeSet<String>(set1)
    sorted.forEach(::println)
    val upperSet = set1.map { it?.uppercase() }
    Arrays.sort(arr)
    upperSet.forEach(::println)
    arr.forEach(::println)

}
fun hash(){
    var arr = HashMap<Int, String>()
    arr.put(1,"one")
    arr.put(2,"two")
    arr.put(3,"three")
    arr.put(4,"four")
    arr.put(5,"five")

    arr.entries.forEach(::println)

    for ( (k,v) in arr ) {
        println("Key - $k Value - $v")
    }



}
fun main() {
    //list2()
    //tree()
    hash()
}
