package com.example.kotlinalgorithms.datastructures.arrays.TwoPointers

/*
3. Reverse String in-place (opposite directions)

📌 Descripción:
Dado un array de caracteres, inviértelo in-place (modificando el mismo array) usando solo O(1) espacio extra.

Ejemplo:

Entrada: ['h','e','l','l','o']

Salida: ['o','l','l','e','h'].
 */

fun main() {
    val textToConvert = "hello"

    println("NORMAL -> ${textToConvert.invertString()}")
    println("TWO POINTERS -> ${textToConvert.invertTwoPointers()}")

}

fun String.invertTwoPointers(): String {
    println("ORIGINAL CONTENT $this")

    val data = this.toCharArray()
    val maxVal = data.size - 1
    for (i in 0 until data.size) {
        if (i == maxVal - i) break
        val aux = data[maxVal - i]
        data[maxVal - i] = data[i]
        data[i] = aux
    }

    return data.contentToString()
}


fun String.invertString(): String {
    val currentStringLength = this.length - 1
    println(currentStringLength)
    var stringInverted = ""
    for (i in currentStringLength downTo 0) {
        stringInverted += this[i]
    }
    return stringInverted
}