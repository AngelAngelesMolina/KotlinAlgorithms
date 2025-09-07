package com.example.kotlinalgorithms.problems.leetcode.arrays

fun main() {
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.



    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    println(fistSolution(nums, target).joinToString(","))
    println(secondSolution(nums, target).joinToString(","))

}

fun fistSolution(nums: IntArray, target: Int): IntArray {
    val indicesSum = IntArray(2)
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                indicesSum[0] = i
                indicesSum[1] = j
                return indicesSum
            }
        }
    }
    return indicesSum
}

fun secondSolution(nums: IntArray, target: Int): IntArray {
    val indicesSum = mutableListOf<Int>()
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                indicesSum.add(i)
                indicesSum.add(j)
            }
        }
    }
    return if (indicesSum.isEmpty()) intArrayOf() else indicesSum.toIntArray()
}