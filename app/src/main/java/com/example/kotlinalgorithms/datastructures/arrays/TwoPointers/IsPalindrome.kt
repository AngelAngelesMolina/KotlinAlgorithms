package com.example.kotlinalgorithms.datastructures.arrays.TwoPointers

import java.util.Locale

fun main() {
   /* 🟢 1. Dos punteros (i, j) → recorrer desde dos extremos

    👉 Problema: Verificar si un string es palíndromo
    Un palíndromo es una palabra que se lee igual al derecho y al revés (ej. "ana", "level").

    Enunciado:
    Dado un String s, devuelve true si es palíndromo, o false si no lo es.*/

    val proof1 = "ana"
    val proof2 = "level"
    val proof3 = "hello"
    println(proof1.isAPalindrome())
    println(proof2.isAPalindrome())
    println(proof3.isAPalindrome())

}

fun String.isAPalindrome()  : Boolean{
    val last = this.length - 1
    for (i in 0 until this.length / 2) { // with iterate just to the middle is enough
        if (this[i] != this[last - i]) {
            return false
        }
    }
    return true
}