package com.example.kotlinalgorithms.leetcode.arrays.LongestCommonPrefix

import com.example.kotlinalgorithms.problems.leetcode.arrays.LongestCommonPrefix.longestCommonPrefix
import org.junit.Assert.assertEquals
import org.junit.Test

class LongestCommonPrefixTest {

    @Test
    fun testNormalPrefix() {
        val strs = arrayOf("flower", "flow", "flight")
        val result = longestCommonPrefix(strs)
        assertEquals("fl", result)
    }

    @Test
    fun testNoCommonPrefix() {
        val strs = arrayOf("dog", "racecar", "car")
        val result = longestCommonPrefix(strs)
        assertEquals("", result)
    }

    @Test
    fun testAllEqual() {
        val strs = arrayOf("test", "test", "test")
        val result = longestCommonPrefix(strs)
        assertEquals("test", result)
    }

    // ---------- Edge cases ----------

    @Test
    fun testEmptyArray() {
        val strs = emptyArray<String>()
        val result = longestCommonPrefix(strs)
        assertEquals("", result)
    }

    @Test
    fun testSingleElement() {
        val strs = arrayOf("alone")
        val result = longestCommonPrefix(strs)
        assertEquals("alone", result)
    }

    @Test
    fun testContainsEmptyString() {
        val strs = arrayOf("flower", "", "flight")
        val result = longestCommonPrefix(strs)
        assertEquals("", result)
    }

    @Test
    fun testSingleCharacterStrings() {
        val strs = arrayOf("a", "a", "a")
        val result = longestCommonPrefix(strs)
        assertEquals("a", result)
    }

    @Test
    fun testDifferentSingleCharacters() {
        val strs = arrayOf("a", "b", "c")
        val result = longestCommonPrefix(strs)
        assertEquals("", result)
    }
}