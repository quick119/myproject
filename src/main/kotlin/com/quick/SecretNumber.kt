package com.quick

import java.util.*

class SecretNumber(val max:Int) {
    var secret:Int = 0
    init {
        secret = Random().nextInt(max) + 1
        println(secret)
    }
}