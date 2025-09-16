package com.example.kotlinalgorithms.datastructures.arrays.OnePointer

fun main() {
/*  Problem:
    Given an IntArray nums and an Int val,
    remove all occurrences of val in-place and return the new length k.
    The first k positions of nums should hold the kept elements (order of the kept elements can be preserved).*/

    //!! Example nums = [3,2,2,3], val = 3  -> return 2, nums first 2 elements might be [2,2]

    val nums = intArrayOf(3,2,2,3)
    val elementToRemove = 3
    val result = removeElement(nums, elementToRemove)
    println("$result")

}


fun removeElement(nums: IntArray, valToRemove: Int): Int{
    if(nums.isEmpty()) return 0
    var k = 0
    for(initial in nums.indices){ // what we have to do?  move the elements
        if(nums[initial] != valToRemove){// current element is not equals to element i want to remove
            nums[k] = nums[initial]
            k++
        }
        println("${nums.contentToString()}")
    }
    return k
}