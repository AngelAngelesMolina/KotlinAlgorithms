package com.example.kotlinalgorithms.problems.challengues

fun main() {
    /*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

    for(index in 1..100){
        val divisibleByThree = index % 3 == 0
        val divisibleByFive = index % 5 == 0
        if (divisibleByThree && divisibleByFive) {
            println("$index - fizzbuzz")
        } else if (divisibleByThree) {
            println("$index - fizz")
        } else if (divisibleByFive) {
            println("$index -buzz")
        } else {
            println(index)
        }
    }

}