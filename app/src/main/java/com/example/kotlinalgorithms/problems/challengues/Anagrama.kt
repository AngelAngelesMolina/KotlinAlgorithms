package com.example.kotlinalgorithms.problems.challengues

fun main() {
     /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */
    println("Ingresa la primera palabra:")
    var wordOne = readLine()!!
    println("Ingresa la segunda palabra:")
    var wordTwo = readLine()!!
    isAnagram(wordOne, wordTwo)


}
private fun isAnagram(wordOne: String, wordTwo: String): Boolean {
    if (wordOne.lowercase() == wordTwo.lowercase()) {
        return false
    }
    return wordOne.lowercase().toCharArray().sortedArray().contentEquals(wordTwo.lowercase().toCharArray().sortedArray())
}