package com.example.kotlinalgorithms.algorithms.sorting

import com.example.kotlinalgorithms.datastructures.arrays.displayDataToUser
import com.example.kotlinalgorithms.datastructures.arrays.getData

fun main(){

    val mData = getData()
    var listnumbers = mData.split(",".toRegex()).toTypedArray()
    var listnumbersInt = IntArray(listnumbers.size)
    for(i in listnumbers.indices){
        listnumbersInt[i] = listnumbers[i].toInt()
    }
    bumbleSortImproved(listnumbersInt)
//    bumbleSort(listnumbersInt)
    println("Aqui estan el arreglo ordenado con metodo burbuja ${listnumbersInt.joinToString(",")}")
}

fun bumbleSortImproved(mArray : IntArray): IntArray{
    var temp = 0
    var isNotSorted = true
    for (i in 0 until mArray.size - 1){ //llegamos al penultimo elemento
        if(!isNotSorted) break
        isNotSorted = false
        for (j in 0 until mArray.size - 1){
            if(mArray[j] > mArray[j + 1]) {
                isNotSorted = true
                temp = mArray[j]
                mArray[j] = mArray[j + 1]
                mArray[j + 1] = temp
            }
        }
    }
    return mArray
}
fun bumbleSort(mArray : IntArray): IntArray{
    var temp = 0
    for (i in 0 until mArray.size - 1){ //llegamos al penultimo elemento
        for (j in 0 until mArray.size - 1){
            if(mArray[j] > mArray[j + 1]) {
                temp = mArray[j]
                mArray[j] = mArray[j + 1]
                mArray[j + 1] = temp
            }
        }
    }
    return mArray
}