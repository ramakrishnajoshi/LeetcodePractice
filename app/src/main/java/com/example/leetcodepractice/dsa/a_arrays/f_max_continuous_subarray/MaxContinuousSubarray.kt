package com.example.leetcodepractice.dsa.a_arrays.f_max_continuous_subarray

import kotlin.math.max

fun main() {
    //Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    //Output: 6
    //Explanation: [4,-1,2,1] has the largest sum = 6.

    //bruteforceSolution()

    //usingKadanesAlgorithm()

    //anotherWay()

    usingKadanesAlgo()
}

fun bruteforceSolution() {
   // val inputArray = arrayListOf<Int>(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val smallInputArray = arrayListOf<Int>(-2, 1, -3, 4, -1, 2, 1, -5, 4)

    var maxSum = Int.MIN_VALUE
    val maxContinousArray = arrayListOf<Int>()

    for ((index, element) in smallInputArray.withIndex()) {
        var tempSum  = 0
        val tempMaxArray = arrayListOf<Int>()
        for (i in index..smallInputArray.lastIndex){
            tempSum += smallInputArray[i]
            tempMaxArray.add(smallInputArray[i])
            if (maxSum < tempSum) {
                maxSum = tempSum
                maxContinousArray.clear()
                maxContinousArray.addAll(tempMaxArray)
            }
        }
    }

    println(maxSum.toString())
    println(maxContinousArray.toString())
}

fun usingKadanesAlgo() {
    // val inputArray = arrayListOf<Int>(-4, -1, -2, -7)
    val inputArray = arrayListOf<Int>(-2, -1, -3, 4, -1, 2, 1, -5, 4)

    var localMaximum = 0
    var globalMaximum = Int.MIN_VALUE

    for ( (index, value) in inputArray.withIndex()) {
        localMaximum  = max(value, localMaximum + value)
        if (localMaximum > globalMaximum) {
            globalMaximum = localMaximum
        }
    }

    println(globalMaximum)
    //Here localMaximum = max( A[i], localMaximum + A[i])
    // So this algo uses previous result to calculate next result i.e DP
}

fun anotherWay() {
    val inputArray = arrayListOf<Int>(-4, -1, -2, -7)

    var maxSoFar = inputArray[0]
    var maxEndingHere = inputArray[0]

    for (i in 1..inputArray.lastIndex) {
        maxEndingHere = max(maxEndingHere + inputArray[i], inputArray[i])
        maxSoFar = max(maxSoFar, maxEndingHere)
    }

    println(maxSoFar)
}

fun usingKadanesAlgorithm2() {
    var currentSum  = 0
    var maxSum = Int.MIN_VALUE
    //val smallInputArray = arrayListOf<Int>(-2, -1, -3, 4, -1, 2, 1, -5, 4)
//    val smallInputArray = arrayListOf<Int>(5, -4, -2, 6, -1)
    val smallInputArray = arrayListOf<Int>(-4, -1, -2, -7)

    for (element in smallInputArray) {
        currentSum += element
        if (currentSum > maxSum) {
            maxSum = currentSum
        }

        if (currentSum < 0) {
            currentSum = 0
        }
    }

    println("Max Sum : $maxSum")
}