package com.example.kotlinalgorithms.problems.leetcode.arrays.remove_duplicates_from_sorted_array

/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
 The remaining elements of nums are not important as well as the size of nums.
Return k.

================ EXAMPLE =============
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

 */



fun main() {
    val nums = intArrayOf(1,1,2)
    val k = removeDuplicates(nums)

    print("k = $k -> ")
    printArray(nums, k)
}

fun printArray(nums:IntArray, number : Int){
    for(i in 0 until number){
        print("${nums[i]} ")
    }
}
fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var i = 1  // índice de escritura (el primero siempre es único)

    for (j in 1 until nums.size) { //desde elemento 1 hasta el ultimo del array
        if (nums[j] != nums[i - 1]) { // si el número actual es diferente al número anterior (quiere decir que es unico)
            nums[i] = nums[j] // guardamos el número único
            i++ // incrementamos la cantidad de numeros unicos
        }
    }

    return i
}

