package com.fs.kotlinfundamentals

//definition of  method = a function within a class

fun main() {
    myFunction()
    myFunction()
    var result = addUp(5, 3)  // here we call function with arguments(not parameters)
    print("result is $result")
    var avg = avg(3.45, 8.3)
    println("avg is $avg")
}

fun myFunction() {
    print("Called from myFunction")
}

// function with input parameters
fun addUp(a: Int, b: Int): Int {
    return a + b
}

fun avg(a: Double, b: Double): Double {
    return (a + b) / 2
}