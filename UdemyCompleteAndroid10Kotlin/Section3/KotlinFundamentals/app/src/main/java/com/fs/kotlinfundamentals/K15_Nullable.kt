package com.fs.kotlinfundamentals

fun main(){

    var name: String = "Denis"
    // name="null"  --> compilation error

    var nullablename: String? = "Denis"    // ?  safe call operator
   //  nullablename = null   // --> compilation OK

    var len1=name.length
    // var len2=nullablename.length  --> compilation error


   //................................................
//    if (nullablename!=null) {
//        var len2=nullablename.length
//    }
//    else {
//        null
//    }

    // or equivalent with :
    var len2=nullablename?.length
   //.................................................

    println(nullablename?.toLowerCase())

nullablename?.let { print(it.length) }  // ? means that it execut only not null
}