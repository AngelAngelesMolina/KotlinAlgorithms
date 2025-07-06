package com.example.kotlinalgorithms.datastructures.strings

/**
Invertir a string example "Hello" to "olleH" with extension function
 */
fun main() {
    val greeting = "Hello"
    println(greeting.reversed())
    println(greeting.myStringReversed())
//    println(greeting)
//    println("Reverse string: ${greeting.revString()}")
//    println(greeting.reversedCustom())
    println("Ingresa tu nombre:")
    val name = readLine()
    println("Ingresa tu edad: $name")
    val age = readLine()!!.toInt()
    age?.let {
        if (age > 18) {
            println("Wow ya eres mayor!")
        } else {
            println("No eres mayor!")
        }
    }
}

fun String.myStringReversed(): String{
    var stringReversed = ""
    for( i in this.length -1 downTo 0){
        stringReversed += this[i]
    }
    return stringReversed
}

fun String.revString(): String {
    var stringReversed = ""
    for (i in this.length - 1 downTo 0) {
        val char = this[i]
        stringReversed += if (i == this.length - 1) {
            char.uppercaseChar()
        } else {
            char.lowercaseChar()
        }
    }
    return stringReversed
}

fun String.reversedCustom(): String {
    val chars = this.toCharArray()
    val n = chars.size
    for (i in 0 until n / 2) {
        val temp = chars[i]
        chars[i] = chars[n - 1 - i]
        chars[n - 1 - i] = temp
    }
    return String(chars)
}
