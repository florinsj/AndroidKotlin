package com.fs.kotlinfundamentals

fun main() {
    var heightPerson1 = 170
    var heightPerson2 = 189
    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("use your power tehnique 1337")
    } else {
        println("use tehnique")
    }

    val age = 17
    if (age >= 21) {
        println("now you may drink in US")
    } else if (age >= 18) {
        println("You may vote now")
    } else if (age >= 16) {
        println("You may drive now")
    } else {
        println("you're too young")
    }


    val age1 = 31
    if (age > 30) println("You are over 30")

    var name = "Denis"
    if (name == "Denis") {
        println("Welcome home Denis!")

    } else println("Who are you ?")

    val isRainy=true
    if (isRainy)
        println("It's rainy")
}