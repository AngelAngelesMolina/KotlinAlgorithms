package com.example.kotlinalgorithms.datastructures

/**
Dinujar una escalera.
 */
fun main() {
   println("Ingresa el tamanio de la escalera:")
    val n = readLine()!!.toInt()
    for (nAsteriscos in 1..n) {
        for (j in 1..nAsteriscos) {
            print("#")
        }
        println()
    }
}