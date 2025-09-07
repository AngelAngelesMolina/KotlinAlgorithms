package com.example.kotlinalgorithms.algorithms.sorting

fun main() {

    val nums = intArrayOf(1,2,6,5)

    for(i in 0 until nums.size - 1){
        for(j in 0 until nums.size - i - 1) {
            if(nums[j] > nums[j + 1]){
                val temp = nums[j]
                nums[j] = nums[j + 1]
                nums[j + 1] = temp
            }
        }
    }
    println(nums.joinToString(","))


}