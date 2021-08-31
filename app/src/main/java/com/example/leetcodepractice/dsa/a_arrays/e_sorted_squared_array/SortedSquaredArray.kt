package com.example.leetcodepractice.dsa.a_arrays.e_sorted_squared_array

import kotlin.math.abs

fun main() {
    //Solution 1:
    //we can square all elements in loop and then sort but that will take O(nLogn) time complexity

    //Solution 2: O(n) time complexity
    println(sortedSquaredArray().contentToString())
}

fun sortedSquaredArray() : Array<Int> {
    val inputArray = arrayOf(-11, -5, -4, 3, 6, 8, 9)


    val outputArray = Array(inputArray.size, { it -> 0})

    var leftIndex = 0
    var rightIndex = inputArray.lastIndex

    var squarePointer = inputArray.lastIndex

    while (leftIndex <= rightIndex) {
        if (abs(inputArray[leftIndex]) < abs(inputArray[rightIndex])) {
            outputArray[squarePointer] = inputArray[rightIndex] * inputArray[rightIndex]
            squarePointer--
            rightIndex--
        } else {
            outputArray[squarePointer] = inputArray[leftIndex] * inputArray[leftIndex]
            squarePointer--
            leftIndex++
        }
    }

    return outputArray
}