package com.example.kotlinalgorithms.problems.hackerrank

/*Sorting is useful as the first step in many different tasks. The most common task is to make
 finding things easier, but there are other uses as well. In this case, it will make it easier
 to determine which pair or pairs of elements have the smallest absolute difference between them.

Example

Sorted, . Several pairs have the minimum difference of : . Return the array .

Note
As shown in the example, pairs may overlap.

Given a list of unsorted integers, , find the pair of elements that have the smallest
absolute difference between them. If there are multiple pairs, find them all.

Function Description

Complete the closestNumbers function in the editor below.

closestNumbers has the following parameter(s):

int arr[n]: an array of integers
Returns
- int[]: an array of integers as described

Input Format

The first line contains a single integer , the length of .
The second line contains  space-separated integers, .*/

/*
 * Complete the 'closestNumbers' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun closestNumbers(arr: Array<Int>): Array<Int> {
    // Write your code here
    //Example -> //4 5 4 3 2
    // RE -> 2 3 3 4 4 5
    //Minimun diferencia -> 1 for that reasons that elements are valid
    //order de array
    //val arraySorted = arr.sort()
    //arr.sort()
    // 1.- ✅ Sorted the array given
    val arraySorted = sortedArray(arr)
    /*✅ 2.- Finding the minimum difference: After sorting, scan the array from left to right,
    comparing each element with the next one, and track the minimum difference you find.*/
    var minimunDifference = 1000000
    for(i in 0 until arraySorted.size - 1){ //compare elements we evaluate until previus last index to not get an
        //index out
        // we have to repeat  -> found de minimun difference
        val diff = arraySorted[i+1] - arraySorted[i]
        if(diff < minimunDifference) minimunDifference = diff
        //return the elements with thta minimun difference
        // 1- Repeating elements
    }
    // 3-✅  Collect all pairs of neighbors with that difference.
    val result = mutableListOf<Int>()

    for(i in 0 until arraySorted.size - 1){
        val diff = arraySorted[i+1] - arraySorted[i]
        if(diff == minimunDifference){
            result.add(arraySorted[i])
            result.add(arraySorted[i+1])
        }
    }


    return arr
}

fun sortedArray(ar : Array<Int>) : Array<Int>{
    var swapped: Boolean
    do {
        swapped = false
        for(i in 0 until ar.size - 1){
            if(ar[i] > ar[i+1]){
                val aux = ar[i+1]
                ar[i+1] = ar[i]
                ar[i] = aux
                swapped = true
            }
        }
    } while (swapped)
    return  ar
}

fun main(args: Array<String>) {
    //val n = readLine()!!.trim().toInt()

    //val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val arra = arrayOf(4, 5, 4, 3, 2)
    val result = closestNumbers(arra)

    //println(result.joinToString(" "))
}