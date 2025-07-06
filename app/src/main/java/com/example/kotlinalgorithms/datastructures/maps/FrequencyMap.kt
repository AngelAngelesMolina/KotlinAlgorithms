package com.example.kotlinalgorithms.datastructures.maps

/*Contar la frecuencia de elementos en un array.
Dado un array como [1, 2, 2, 3, 1, 1], cuenta cuántas veces aparece cada número.*/

fun main() {
    val numbers = listOf(1, 2, 2, 3, 1, 1)
    val numbers2 = intArrayOf(1, 2, 2, 3, 1, 1)

    val result = countFrequencies(numbers)
    val result2 = countFrequencies(numbers2)

    for ((key, value) in result) {
        println("$key aparece $value veces")
    }
    println("IntArray")
    for ((key2, value2) in result2) {
        println("$key2 aparece $value2 veces")
    }
}

fun countFrequencies(numbers: List<Int>): Map<Int, Int> {
    val frequencyMap = mutableMapOf<Int, Int>()
    for (num in numbers) {
        if (frequencyMap.containsKey(num)) {
            frequencyMap[num] = frequencyMap[num]!! + 1
        } else {
            frequencyMap[num] = 1
        }
        //frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }
    return frequencyMap
}

fun countFrequencies(numbers: IntArray) : Map<Int, Int>{
    val freqMap = mutableMapOf<Int, Int>()
    for(num in numbers){
       /* if(freqMap.containsKey(num)){
            freqMap[num] = freqMap[num]!! + 1
        }else{
            freqMap[num] = 1
        }*/
        freqMap[num] = freqMap.getOrDefault(num, 0) + 1
    }
    return freqMap
}

/*Encontrar el número que aparece una sola vez.
En un array donde todos los elementos aparecen dos veces excepto uno, encuentra ese elemento único.

Dos números que suman un objetivo (Two Sum).
Dado un array y un número objetivo, encuentra dos índices cuyos elementos sumen ese número.

Detectar si hay duplicados.
Verifica si hay algún número repetido en un array.

Primer número que se repite.
Dado un array, retorna el primer número que aparece más de una vez.*/