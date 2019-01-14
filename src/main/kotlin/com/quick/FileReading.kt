package com.quick

import java.io.File

fun main(args: Array<String>) {
    File("data.txt").bufferedReader().forEachLine {
        println(it)
    }
}