package com.example.kotlinalgorithms.problems.hackerrank

//!! CountNumberPairs

/*
Count Number Pairs
Given a sorted array of positive integers and a target value,
 count the number of pairs (i, j) where i < j and array[i] + array[j] <= target.

Example

Input:

prices = [1, 2, 3, 4, 5]
budget = 7
Output:

8
Explanation:

We need pairs (i, j) with i < j and prices[i] + prices[j] ≤ 7. List all pairs:

(1, 2) = 3 ≤ 7
(1, 3) = 4 ≤ 7
(1, 4) = 5 ≤ 7
(1, 5) = 6 ≤ 7
(2, 3) = 5 ≤ 7
(2, 4) = 6 ≤ 7
(2, 5) = 7 ≤ 7
(3, 4) = 7 ≤ 7
Pairs like (3,5)=8, (4,5)=9 exceed the budget. Total valid pairs = 8.

Input Format

The input is provided in two lines:

The first line contains two space-separated integers n and budget, where:

0 ≤ n ≤ 1000
1 ≤ budget ≤ 10^9
The second line contains n space-separated integers prices[0], prices[1], ..., prices[n-1], where:

1 ≤ prices[i] ≤ 10^9 for all 0 ≤ i < n
prices is sorted in non-decreasing order
 */

fun countAffordablePairs(prices: Array<Int>, budget: Int): Int {
    // 1- create my variables counter
    var counter = 0
    if(prices.size < 2) return 0 // We can't do pairs
    // 2 - Iterate my prices
    for ( i in 0 until prices.size - 1){ // compare to the penultimun element for do i + 1
        //check the condition
        for (j in i + 1 until prices.size) { // start from i+1
            if (prices[i] + prices[j] <= budget) counter++
        }
    }
    return counter

}


fun main(args: Array<String>) {
    val pricesCount = readLine()!!.trim().toInt()

    val prices = Array<Int>(pricesCount, { 0 })
    for (i in 0 until pricesCount) {
        val pricesItem = readLine()!!.trim().toInt()
        prices[i] = pricesItem
    }

    val budget = readLine()!!.trim().toInt()

    val result = countAffordablePairs(prices, budget)

    println(result)
}
