package com.example.kotlinalgorithms.problems.hackerrank

//!!TimeSlotTaskPairing

/*
Time Slot Task Pairing
Given an array of positive integers and a target integer,
 return the indices of two elements that sum to the target or [-1, -1] if no such pair exists.

Example 1

Input:

taskDurations = [2, 7, 11, 15]
slotLength = 9
Output:

[0, 1]
Explanation:

We look for two durations that sum to the slotLength.
Starting with index 0 (2), we need 7 (9-2). At index 1, duration is 7. Thus indices [0, 1] sum to 9.

 */


fun findTaskPairForSlot(taskDurations: Array<Int>, slotLength: Int): Array<Int> {
    val seen = mutableMapOf<Int, Int>() // value -> index
    for ((i, duration) in taskDurations.withIndex()) {// key , value
        val complement = slotLength - duration
        if (seen.containsKey(complement)) {
            return arrayOf(seen[complement]!!, i)
        }
        seen[duration] = i //update de value of that key
        println(seen.toString())
    }

    return arrayOf(-1, -1)
    /*
    if(taskDurations.size < 2)   return intArrayOf(-1,-1).toTypedArray()
    for(i in 0 until taskDurations.size - 1){
        if(taskDurations[i] + taskDurations[i+1] == slotLength){
            return intArrayOf(i, i+1).toTypedArray()
        }
    }


    return intArrayOf(-1,-1).toTypedArray()
*/
}

fun main(args: Array<String>) {
    val taskDurationsCount = readLine()!!.trim().toInt()

    val taskDurations = Array<Int>(taskDurationsCount, { 0 })
    for (i in 0 until taskDurationsCount) {
        val taskDurationsItem = readLine()!!.trim().toInt()
        taskDurations[i] = taskDurationsItem
    }

    val slotLength = readLine()!!.trim().toInt()

    val result = findTaskPairForSlot(taskDurations, slotLength)

    println(result.joinToString("\n"))
}