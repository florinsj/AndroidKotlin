package com.fs.kotlinfundamentals

fun main() {
    for (num in 1..10) {
        print("$num ")
    }
    println()

    // infix notation
    for (i in 1 until 10) {   // same as for(i in 1.until(10))
        print("$i ")
    }
    for (j in 10 downTo 1 step 2) { // same as for(j in 10.downTo(1).step(2))
        print("$j ")
    }
}