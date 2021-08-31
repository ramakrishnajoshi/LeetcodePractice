package com.example.leetcodepractice.dsa.a_arrays.h_prefixsum


fun main() {
    // Input : [ 1, 4, -6, 2, 5, -3, 9]
    // Output: [ 1, 5, -1, 1, 6,  3, 12]

//    prefixSumBruteForce()

    prefixSumOptimized()
}

// Time : O(n^2)
fun prefixSumBruteForce() {

    val inputArrayList = arrayListOf<Int>(1, 4, -6, 2, 5, -3, 9)
    val outputArrayList = arrayListOf<Int>()

    for ( (index, element) in inputArrayList.withIndex()) {
        var sum = 0
        for (j in 0..index) {
            sum = sum + inputArrayList[j]
        }
        outputArrayList.add(sum)
    }

    println(outputArrayList)
}

// Time : O(n)
fun prefixSumOptimized() {

    val inputArrayList = arrayListOf<Int>(1, 4, -6, 2, 5, -3, 9)
    val outputArrayList = arrayListOf<Int>()
    var sum = 0
    for ( (index, element) in inputArrayList.withIndex()) {
        sum = sum + element
        outputArrayList.add(sum)
    }

    println(outputArrayList)

    //range between index [2,6]
    println("range between index [2,6] : ${outputArrayList[6] - outputArrayList[1]}")

    //range between A[6,2] = A[6] - A[2-1] i.e  A[i,j] = A[j] - A[i-1]
}