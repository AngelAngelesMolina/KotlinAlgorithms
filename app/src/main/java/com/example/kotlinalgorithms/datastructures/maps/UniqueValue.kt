package com.example.kotlinalgorithms.datastructures.maps

/*Encontrar el número que aparece una sola vez.
En un array donde todos los elementos aparecen dos veces excepto uno, encuentra ese elemento único.
 */

fun main() {
    val numbers = listOf(1,2,2,3,1,1,4)
    println("In the list: ${numbers.joinToString(",")}")
    println("The numbers that are not repeated: ${noRepeatValue(numbers)}")
}


private fun noRepeatValue(mNumbers : List<Int>): List<Int>{
    val numbersMap = mutableMapOf<Int,Int>()
    for(number in mNumbers){
        numbersMap[number] = numbersMap.getOrDefault(number, 0)+1
    }

    /*val uniqueValues =  mutableListOf<Int>()
    for((mkey, mvalue)  in numbersMap)
    {
        if(mvalue == 1){
            uniqueValues.add(mkey)
        }
    }*/
    val uniqueValues = numbersMap.filter { it.value == 1 }.keys.toList()
    return uniqueValues

}