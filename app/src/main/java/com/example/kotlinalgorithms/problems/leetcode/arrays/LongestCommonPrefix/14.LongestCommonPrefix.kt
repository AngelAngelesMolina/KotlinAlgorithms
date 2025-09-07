package com.example.kotlinalgorithms.problems.leetcode.arrays.LongestCommonPrefix


fun main() {
//    Write a function to find the longest common prefix string amongst an array of strings.
//
//    If there is no common prefix, return an empty string "".
//
//
//
//    Example 1:
//
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
//    Example 2:
//
//    Input: strs = ["dog","racecar","car"]
//    Output: ""
//    Explanation: There is no common prefix among the input strings.




}
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    // Start with the first string as prefix
    var prefix = strs[0]

    for (i in 1 until strs.size) {
        // While the current string does not start with prefix, shorten prefix
        while (!strs[i].startsWith(prefix)) {
            prefix = prefix.dropLast(1)
            if (prefix.isEmpty()) return ""
        }
    }

    return prefix
}