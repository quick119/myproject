package com.quick

class Student(var name:String, var english:Int, var math:Int) {
    fun average() : Int {
        return (english+math)/2
    }

    fun highest() = if (english > math) english else math
}

fun main(args: Array<String>) {
    val stu = Student("Quick", 80, 100)
    println(stu.highest())
}