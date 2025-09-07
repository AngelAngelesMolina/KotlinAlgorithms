package com.example.kotlinalgorithms.leetcode.arrays.remove_duplicates_from_sorted_array

import com.example.kotlinalgorithms.problems.leetcode.arrays.remove_duplicates_from_sorted_array.removeDuplicates
import junit.framework.TestCase.assertEquals
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class RemoveDuplicatesTest {

    @Test
    fun testExample1() {
        val nums = intArrayOf(1, 1, 2)
        val k = removeDuplicates(nums)
        assertEquals(2, k)
        assertArrayEquals(intArrayOf(1, 2), nums.copyOfRange(0, k))
    }

    @Test
    fun testExample2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val k = removeDuplicates(nums)
        assertEquals(5, k)
        assertArrayEquals(intArrayOf(0, 1, 2, 3, 4), nums.copyOfRange(0, k))
    }

    // ---------- Edge cases ----------

    @Test
    fun testEmptyArray() {
        val nums = intArrayOf()
        val k = removeDuplicates(nums)
        assertEquals(0, k)
    }

    @Test
    fun testSingleElement() {
        val nums = intArrayOf(5)
        val k = removeDuplicates(nums)
        assertEquals(1, k)
        assertArrayEquals(intArrayOf(5), nums.copyOfRange(0, k))
    }

    @Test
    fun testAllDuplicates() {
        val nums = intArrayOf(7, 7, 7, 7, 7)
        val k = removeDuplicates(nums)
        assertEquals(1, k)
        assertArrayEquals(intArrayOf(7), nums.copyOfRange(0, k))
    }

    @Test
    fun testAlreadyUnique() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = removeDuplicates(nums)
        assertEquals(5, k)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), nums.copyOfRange(0, k))
    }
}
