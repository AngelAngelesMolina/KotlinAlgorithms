package com.example.kotlinalgorithms.datastructures.arrays.two_pointers

import com.example.kotlinalgorithms.datastructures.arrays.TwoPointers.TwoSumII
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class TwoSumIITest {

    @Test
    fun testExample1() {
        val numbers = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = TwoSumII(numbers, target)
        assertArrayEquals(intArrayOf(1, 2), result) // 2 + 7 = 9
    }

    @Test
    fun testAnotherCase() {
        val numbers = intArrayOf(1, 3, 4, 5, 7)
        val target = 8
        val result = TwoSumII(numbers, target)
        assertArrayEquals(intArrayOf(2, 4), result) // 3 + 5 = 8
    }

    @Test
    fun testSmallArray() {
        val numbers = intArrayOf(3, 3)
        val target = 6
        val result = TwoSumII(numbers, target)
        assertArrayEquals(intArrayOf(1, 2), result) // 3 + 3 = 6
    }

    @Test
    fun testNoSolution() {
        val numbers = intArrayOf(1, 2, 3, 4)
        val target = 10
        val result = TwoSumII(numbers, target)
        assertArrayEquals(intArrayOf(), result) // no existe solución
    }

    @Test
    fun testLargerArray() {
        val numbers = intArrayOf(1, 2, 3, 4, 9, 11)
        val target = 13
        val result = TwoSumII(numbers, target)
        assertArrayEquals(intArrayOf(4, 6), result) // 4 + 11 = 13
    }
}