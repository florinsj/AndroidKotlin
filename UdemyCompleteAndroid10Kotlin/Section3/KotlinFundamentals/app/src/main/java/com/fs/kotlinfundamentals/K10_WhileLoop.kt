package com.fs.kotlinfundamentals

fun main() {
    var x = 1
    while (x <= 10) {
        print("$x")
        x++
    }
    println("\n while loop is done")

    var y = 100
    while (y >= 0) {
        print("$y ")
        y -= 2
    }
    println()
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }
}