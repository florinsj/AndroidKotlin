package com.fs.kotlinfundamentals

fun main() {
    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when (month) {
        in 3..5 -> println("Spring")  //range of values
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")   // if one of the specified values
        else
            println
        ("Invalid Season")
    }
}