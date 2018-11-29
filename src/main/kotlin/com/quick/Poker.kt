package com.kotlin

fun main(args: Array<String>) {

}

class Deck {
//    char[] types = {}
    companion object {
        val types = listOf<Char>('\u2663', '\u2666', '\u2665', '\u2660' )
        val points = listOf<String>("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    }

    val cards = IntArray(52)
    init {
        initial()
//        print()
    }

    fun print() {
        println()
    }

    fun initial() {
        var i = 0
        for (card in cards) {
            cards[i] = i
            i++
        }
    }
}