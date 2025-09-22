package com.example.kotlinalgorithms.problems.hackerrank


fun countResponseTimeRegressions(responseTimes: Array<Int>): Int {
    //1 - Create my acum var for average (this will be the content of my current position / counter)
    var sumArrayValues = 0L  // prevent overflow
    var greaterElement = 0

    if (responseTimes.size < 2) return 0
    // 2 - Iterate
    for (i in responseTimes.indices) {
        if (i > 0) {
            val average = sumArrayValues.toDouble() / i
            //3 if current element is greater than the average increase counter
            if (responseTimes[i] > average) greaterElement++
        }
        sumArrayValues += responseTimes[i]
    }

    return greaterElement


}


fun main(args: Array<String>) {
    val responseTimesCount = readLine()!!.trim().toInt()

    val responseTimes = Array<Int>(responseTimesCount, { 0 })
    for (i in 0 until responseTimesCount) {
        val responseTimesItem = readLine()!!.trim().toInt()
        responseTimes[i] = responseTimesItem
    }

    val result = countResponseTimeRegressions(responseTimes)

    println(result)
}
