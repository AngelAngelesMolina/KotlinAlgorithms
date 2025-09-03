package com.example.kotlinalgorithms.datastructures.strings

//El palindromo es una palabra o frase que se puede leer igual al derecho y al reves, no importa si está en mayúsculas o minúsculas.
fun main() {
    println("Ingresa una palabra o frase:")
    var dataString = readLine()!!.lowercase().replace(" ", "")

    if (dataString.isPalindrome()) {
        println("Es palindromo")
    } else {
        println("No es palindromo")
    }
}
fun String.polindromo() :Boolean{
    var igual = true
    var cont = 0
    for (ind in this.length - 1 downTo 0) {
        if (this[ind] != this[cont]) {
            igual = false
            break
        }
        cont++
    }
    return igual
}

fun String.isPalindrome(): Boolean {
    val cleaned = this.lowercase().replace(" ", "")
    val len = cleaned.length
    for (i in 0 until len / 2) {
        if (cleaned[i] != cleaned[len - 1 - i]) return false
    }
    return true
}