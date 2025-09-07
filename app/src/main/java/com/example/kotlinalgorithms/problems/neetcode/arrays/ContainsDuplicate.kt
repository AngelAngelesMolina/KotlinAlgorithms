package com.example.kotlinalgorithms.problems.neetcode.arrays

/*
Contains Duplicate
Given an integer array nums, return true if any value
appears more than once in the array, otherwise return false.
 */

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    println(hasDuplicate(nums))
}
fun hasDuplicate(nums: IntArray): Boolean {
    val duplicatemap = mutableMapOf<Int, Int>()

    for(num in 0 until nums.size){
        if(duplicatemap.containsKey(nums[num])){
            return true
        }
        duplicatemap[nums[num]] = num
    }

    return false


}