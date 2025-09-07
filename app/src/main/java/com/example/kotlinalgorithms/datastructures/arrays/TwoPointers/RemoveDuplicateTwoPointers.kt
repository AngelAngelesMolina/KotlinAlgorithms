package com.example.kotlinalgorithms.datastructures.arrays.TwoPointers


/*
📌 Descripción:
Dado un array de enteros ordenado en orden no decreciente, elimina los duplicados in-place de forma que cada
 elemento único aparezca solo una vez. Retorna el número de elementos únicos. El orden relativo debe mantenerse.

Ejemplo:

Entrada: [1,1,2]

Salida: 2, con los primeros elementos [1,2,_].
 */

fun main() {
    val nums = intArrayOf(1,1,2)
    var initial = 1
    for (currentNum in 1 until nums.size){
        if(nums[currentNum] != nums[initial - 1]){
            nums[initial] = nums[currentNum]
            initial++
        }
    }

    println(initial)
}