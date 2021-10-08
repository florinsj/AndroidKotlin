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
        else-> println("Invalid Season")
    }

    var age = 25
    when (age) {
        in 21..150 -> println("now you may drink in US")
        in 18..20 -> println("You can vote now")
        16, 17 -> println("You may drive now")
        else -> println("you are too young")
    }

    var x: Any = 133.37
    when (x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")

    }

}