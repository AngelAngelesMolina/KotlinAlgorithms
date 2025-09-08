package com.example.kotlinalgorithms.datastructures.arrays.TwoPointers


/*
2. Two Sum II – Input array is sorted (opposite directions)

📌 Descripción:
Dado un array de enteros ordenado en orden ascendente y un número objetivo, encuentra dos números en el array cuya suma sea igual al objetivo. Retorna sus índices (1-based).

Ejemplo:

Entrada: numbers = [2,7,11,15], target = 9

Salida: [1,2] porque 2 + 7 = 9.
 */


fun main() {
    val numbers = intArrayOf(2,7,11,15)
    val target = 9
    println("${numbers.joinToString(",")}, target -> $target")
    println(TwoSumII(numbers, target).contentToString())
}

fun TwoSumII(numbers : IntArray, target:Int): IntArray{
    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf(i + 1, j + 1) // return directo
            }
        }
    }
    return intArrayOf() // si no hay solución
}