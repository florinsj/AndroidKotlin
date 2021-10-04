package com.fs.kotlinfundamentals

fun main() {

    // you can specify datatype or not (will be referred in second case)

    // Integer types
    val myByte: Byte = 13  // Byte type  8 bits
    val myShort: Short = 125 //Short type 16 bits
    val myInt: Int = 12111232  //  Int type 32 bits
    val myLong: Long = 29_309_094_020  // Long type 64 bits
    val myAge = 31 // no need to specify the type -- type is inferred
//..........................................//

    // Float types
    val myFloat: Float = 13.37f  // Float type 32 bits  -- f is mandatory for float otherwise double
    val myDouble: Double = 3.1412323232132131   // Double type 64 bits
    val myNumber = 3.143  // type inferred -- no f  --> Double type
//..........................................//

    // Boolean type  true or false
    var isSunny: Boolean = false // Boolean type
    isSunny = true
    var foundIt = true  // Boolean type inferred

//..........................................//

    //Characters
    val letterChar = 'A' //Character type
    var digitChar = '1'  // Character type inferred

// ..........................................//
    //String  == collection of characters
    val myString = "Hello World"  // String type inferred
    var firstCharInStr = myString[0]  // Char variable inferred
    var lastCharinStr = myString[myString.length - 1]

}