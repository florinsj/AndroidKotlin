package com.fs.kotlinfundamentals

fun main() {
    for (i in 0..10000) {
        if (i == 9001) println("IT'S OVER 9000!!!")
    }

    var humidityLevel = 80
    var humidity = "humid"
    while (humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel < 60) {
            println("It's comfy now")
            humidity = "comfy"
        }
    }


}