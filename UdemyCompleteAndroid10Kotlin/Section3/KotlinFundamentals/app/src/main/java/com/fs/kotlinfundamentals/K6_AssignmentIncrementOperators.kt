package com.fs.kotlinfundamentals

fun main() {

    //Assignment Operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    myNum /= 2
    myNum %= 3
    myNum -= 1
    println("myNum is $myNum")

    // Increment and Decrement operators (++, --)
    println("Increment op")
    myNum = 4
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
    myNum--


}