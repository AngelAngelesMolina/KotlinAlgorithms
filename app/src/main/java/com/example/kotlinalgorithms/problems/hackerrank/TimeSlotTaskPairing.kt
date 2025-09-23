package com.example.kotlinalgorithms.problems.hackerrank

import android.R

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

fun dingTaskPair(taskDurations: Array<Int>, slotLength: Int) : Array<Int>{
    var mapDuration = mutableMapOf<Int, Int>()
    for(duration in taskDurations.indices){
        val complement = slotLength - taskDurations[duration] // I have the complement to get the slot
        if(complement in mapDuration.keys){
            return arrayOf(mapDuration[complement]!!, duration)
        }
        mapDuration[taskDurations[duration]] = duration //
    }


    return arrayOf(-1, -1)
}
fun findTaskPairForSlot(taskDurations: Array<Int>, slotLength: Int): Array<Int> {
    val seen = mutableMapOf<Int, Int>() // value -> index
    for ((i, duration) in taskDurations.withIndex()) {// key , value KEY is index duration is THE value of the array in the current index
        val complement = slotLength - duration
        if (seen.containsKey(complement)) {
            return arrayOf(seen[complement]!!, i)
        }
        seen[duration] = i //update de value of that key
        println(seen.toString())
    }

    return arrayOf(-1, -1)
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
    //val result = dingTaskPair(taskDurations, slotLength)

    println(result.joinToString("\n"))
}