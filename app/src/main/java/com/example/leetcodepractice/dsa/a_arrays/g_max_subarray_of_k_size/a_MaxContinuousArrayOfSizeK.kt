package com.example.leetcodepractice.dsa.a_arrays.g_max_subarray_of_k_size

//This is also called sliding window problem
fun main() {
    //Input : [2, 1, 5, 1, 3, 2] with k=3
    //Output : [5, 1, 3] and 9

    //maxSubArrayOfSizeKBruteForce()
    maxSubArrayOfSizeKOptimised()
}

fun maxSubArrayOfSizeKOptimised() {
    val inputArray = arrayListOf<Int>(1, 9, -1, -2, 7, 3, -1, 2)
    val k = 4

    var windowSum = 0
    var currentSum = 0
    for (index in 0..k-1) {
        windowSum = windowSum + inputArray[index]
    }
    currentSum = windowSum

    for ( index in k..inputArray.lastIndex) {
        windowSum = windowSum + inputArray[index] - inputArray[index - k]
        if (windowSum > currentSum) {
            currentSum = windowSum
        }
    }

    println(currentSum.toString())
}

fun maxSubArrayOfSizeKBruteForce() /*: List<Int>*/ {

    val inputArray = arrayListOf<Int>(1, 9, -1, -2, 7, 3, -1, 2)
    val k = 4
    var maxSum = 0
    val outputArray = arrayListOf<Int>()

    for (index in 0..inputArray.lastIndex -k ) {

        var tempSum = 0
        for (j in index..index + k -1 ) {
            tempSum += inputArray[j]
        }
        if (maxSum < tempSum) {
            maxSum = tempSum
        }
    }

    println(maxSum)
}