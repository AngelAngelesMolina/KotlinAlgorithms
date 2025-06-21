package com.example.kotlinalgorithms.datastructures.arrays
/**
Invertir a string example "Hello" to "olleH" with extension function
 */
fun main() {
    val numerosMutables = mutableListOf(5, 12, 3, 8, 21, 1)
    println(findMaxNumber(numerosMutables))
}

fun findMaxNumber(mList : List<Int>) : Int{
    if(mList.isEmpty()) return 0
    else{
        var maxNumber = mList[0]
        for(i in mList){
            if(i>maxNumber) maxNumber = i
        }
        return maxNumber
    }

}