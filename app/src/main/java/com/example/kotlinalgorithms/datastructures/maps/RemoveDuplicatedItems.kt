package com.example.kotlinalgorithms.datastructures.maps

/*Eliminar duplicados de un string.*/


fun main() {
    val numbers = listOf(1,2,2,3,1,1,4)

    println("The elements with items  not duplicated are: ${removeDuplicates(numbers).joinToString(",")}")



}

private fun removeDuplicates(mNumbers : List<Int>) : List<Int>{

    val mapNumber = mutableMapOf<Int, Int>()
    for(number in mNumbers){
        mapNumber[number] = mapNumber.getOrDefault(number, 0)+1
    }
    val uniqueNumbers = mutableListOf<Int>()
    for((mKey, mValue) in mapNumber){
        if(mValue == 1){
            uniqueNumbers.add(mKey)
        }
    }
    return mapNumber.filter{it.value == 1}.keys.toList()

}