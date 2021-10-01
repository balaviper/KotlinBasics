package com.example.kotlinbasics.test.testing.scope

private class Person(
    val name: String,
    var age: Int,
    var city: String
) {
    fun moveTo(newCity : String) {
        this.city = newCity
    }

    fun celebrateBirthday() {
        age++
    }
    override fun toString() : String{
        return "name $name age $age city $city"

    }
}

private fun demo1() {
    val p = Person("abc",12,"vvv")
    p.celebrateBirthday()

    val q = Person("abc",12,"vvv")
    q.moveTo("lll")
    p.celebrateBirthday()

    // The scope functions do not introduce any new technical capabilities,
    // but they can make your code more concise and readable.

    Person(
        "bcd",
        89,
        "nnn"
    ).let {
        it.moveTo("kkk")
        it.celebrateBirthday()
    }

    val list = listOf<String?>("abc", "pqr", "lmn", null, "ghh", "nnm")
    list.forEach { el ->
        el?.let {
            println(it.uppercase())
        }
    }
}

private fun demo2(){
    val p = Person("abc", 10,"nn")
    val q = with(p){
        this.age = 12
        this.city = "jjj"
        this.celebrateBirthday()
        this.moveTo("mmm")

    }
    println(p.age)
    println(q)
}

private fun demo3(){
    val pr = Person("bala",78,"uuuuu").apply {
        age = 20
        city = "bnp"
    }
    println(pr)

}

private fun demo4() {
    // The context object is available as an argument (it).
    // The return value is the object itself.

    // let Person object perform this work; also get me same object back
    val pr = Person("abc", 78, "uuu").also {
        it.age = 20
        it.city = "bnn"
        // some operation that will change the sate
    }
}

fun main() {
    //demo1()
    demo2()
    demo3()
}
