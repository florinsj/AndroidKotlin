package com.fs.kotlinfundamentals

fun main() {
    // Comparison Operators ( ==, >, <, !=, <=, >=)
    val isEqual = 5 == 3
    println("isEqual is " + isEqual)  // equal with  print("isEqual is $isEqual")
    //println("isEqual is $isEqual")   // this concept is called string interpolation

    // println("a is "+a)  string concatenation
    // println("a is $a")  string interpolation (kotlin use a template expression prefixed with $)


    val isNotEqual = 5 != 5
    println("isNotEqual is $isNotEqual")

    println("is5greater3 is ${5 > 3}")
    println("is5LowerEqual3 is ${5 <= 3}")
    println("is5GreaterEqual3 is ${5 >= 3}")
}