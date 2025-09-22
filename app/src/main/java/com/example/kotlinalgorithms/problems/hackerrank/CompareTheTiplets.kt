package com.example.kotlinalgorithms.problems.hackerrank

/*

Alice and Bob each created one problem for HackerRank.
A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories:
 problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for
 Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to calculate their comparison points by comparing each category:

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.
Example

a = [1, 2, 3]
b = [3, 2, 1]

For elements *0*, Bob is awarded a point because a[0] < b[0].
For the equal elements a[1] and b[1], no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.

Function Description

Complete the function compareTriplets with the following parameter(s):

int a[3]: Alice's challenge rating
int b[3]: Bob's challenge rating
Returns

int[2]: the first element is Alice's score and the second is Bob's score


 */



fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    //1- has a pointVar for each person
    var pointsAlice = 0
    var pointsBob = 0
    //2- iterate the arrays
    if(a.size != b.size) return emptyArray<Int>()
    for(i in 0 until a.size){
        if(a[i] > b[i]){// compare alice is greater than bob
            pointsAlice++
        } else if(a[i]< b[i]){ //bob is greater
            pointsBob++
        }
    }
    val result = intArrayOf(pointsAlice, pointsBob)
    return result.toTypedArray()

}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}