package com.example.kotlinalgorithms.problems.hackerrank

//!! CheckPalindromeByFilteringNonLetters
/*

Check Palindrome by Filtering Non-Letters
Given a string containing letters, digits, and symbols, determine
if it reads the same forwards and backwards when considering only
alphabetic characters (case-insensitive).

Example

Input

code = A1b2B!a
Output

1
Explanation

- Step 1: Extract only letters → ['A','b','B','a']
- Step 2: Convert to lowercase → ['a','b','b','a']
- Step 3: Compare sequence forward and backward: 'abba' == 'abba' → true
Input Format

A string code containing letters (A–Z, a–z), digits (0–9), and symbols

 */
fun isAlphabeticPalindrome(code: String): Boolean {
    //1 - Extract letters only
    var cleanString = mutableListOf<String>()

    val alphabeticData = code.toCharArray()
    for(i in 0 until alphabeticData.size){
        if(alphabeticData[i].isLetter()){
            //2 -  CONVERTING TO LOWERCASE
            cleanString.add(alphabeticData[i].lowercaseChar().toString())
        }
    }
    // 3- COMPARE IF IS A PALINDROME
    for (i in 0 until cleanString.size / 2){ // 4 -> 3
        if(cleanString[i] != cleanString[cleanString.size - 1 - i]) return false
    }
    return true
}

fun main(args: Array<String>) {
    val code = readLine()!!

    val result = isAlphabeticPalindrome(code)

    println(if (result) 1 else 0)
}