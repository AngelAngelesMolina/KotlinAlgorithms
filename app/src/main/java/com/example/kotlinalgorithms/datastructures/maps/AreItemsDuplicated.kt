package com.example.kotlinalgorithms.datastructures.maps

/*Detectar si hay duplicados.
Verifica si hay algún número repetido en un array.*/


fun main() {
    val numbers = listOf(1, 2, 2, 3, 1, 1)
    val numbers2 = listOf(1, 2, 3, 4, 5)
    val numbers3 = intArrayOf(1, 2, 2, 3, 1, 1)
    val numbers4 = intArrayOf(1, 2, 3, 4, 5)


    if(numbers3.size > numbers3.toSet().size) println("Hay duplicados") else println("No hay duplicados")
    if(numbers4.size > numbers4.toSet().size) println("Hay duplicados") else println("No hay duplicados")
    println("_--------- 2 -----------------")

    println("Hay duplicados? ${hasDuplicates(numbers)}")
    println("Hay duplicados? ${hasDuplicates(numbers2)}")

    println("_--------- 2 -----------------")

    println("Hay duplicados? ${hasDuplicates2(numbers)}")
    println("Hay duplicados? ${hasDuplicates2(numbers2)}")
    println("_--------- 3 -----------------")

    println("Hay duplicados? ${hasDuplicates3(numbers)}")
    println("Hay duplicados? ${hasDuplicates3(numbers2)}")


}

private fun hasDuplicates(mNumbers : List<Int>) : Boolean{
    val mSet = mutableSetOf<Int>()

    for(number in mNumbers){
        mSet.add(number)
    }

    if(mSet.size < mNumbers.size){
        return true
    }
    return false
}
private fun hasDuplicates2(numbers: List<Int>): Boolean {
    return numbers.size > numbers.toSet().size
}

private fun hasDuplicates3(numbers: List<Int>): Boolean {
    val seen = mutableSetOf<Int>()
    for (num in numbers) {
        if (!seen.add(num)) { // add devuelve false si el elemento ya existía
            return true
        }
    }
    return false
}