package com.example.kotlinalgorithms.datastructures.arrays.pointer_from_front

val nums = intArrayOf(0,1,0,3,12)
fun main() {
/*
    Given nums: IntArray, move all zeros to the end while
        keeping the order of non-zero elements. Modify in-place.
        */
 //* EXAMPLE -> [0,1,0,3,12] -> [1,3,12,0,0]

    moveZeroes(nums)

}
fun moveZeroes(nums: IntArray): Unit{
    // 0 1 2 3
    var k = 0
    for(i in 0 until nums.size){
        if(nums[i] != 0){
            nums[k] = nums[i]
            k++
        }
    } // We move the element that matters
    //Now we will put the others in 0
    for(j in k until nums.size){
        nums[j] = 0
    }
    println(nums.contentToString())
}