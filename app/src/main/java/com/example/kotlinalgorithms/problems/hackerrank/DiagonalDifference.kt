package com.example.kotlinalgorithms.problems.hackerrank

import kotlin.math.abs

/*

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = .
The right-to-left diagonal = .
Their absolute difference is .

Function description

Complete the  function with the following parameter:

: a 2-D array of integers
Return

: the absolute difference in sums along the diagonals

 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sumLeft = 0
    var sumRight = 0
    val n = arr.size

    for (i in 0 until n) {
        sumLeft += arr[i][i]                // primary diagonal
        sumRight += arr[i][n - i - 1]       // secondary diagonal
    }

    return abs(sumLeft - sumRight)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}