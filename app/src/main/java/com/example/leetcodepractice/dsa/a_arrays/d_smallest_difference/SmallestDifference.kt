package com.example.leetcodepractice.dsa.a_arrays.d_smallest_difference

import kotlin.math.abs

fun main() {
    //Essentially find two closest numbers
    println(smallestDifference())
}

//Incomplete solution
fun smallestDifference() : List<Int> {

    val inputList1 = arrayListOf<Int>(-1, 5, 10, 20, 28, 3)
    val inputList2= arrayListOf<Int>(26, 134, 135, 15, 17)

    inputList1.sort() //[-1, 3, 5, 10, 20, 28]
    inputList2.sort() //[15, 17, 26, 134, 135]

    var pointer1 = 0
    var pointer2 = 0
    var potentialSmallestDiff = abs(inputList1[pointer1] - inputList2[pointer2])
    val potentialClosestNumbers = arrayListOf<Int>(inputList1[pointer1], inputList2[pointer2])

    for ( (index, value) in inputList1.withIndex()) {

        if (potentialSmallestDiff > abs(inputList1[pointer1] - inputList2[pointer2])) {
            potentialSmallestDiff = abs(inputList1[pointer1] - inputList2[pointer2])
            potentialClosestNumbers[0] = inputList1[pointer1]
            potentialClosestNumbers[1] = inputList2[pointer2]
        }
        if (inputList1[pointer1] < inputList2[pointer2]) { //  -1 < 15
            pointer1++
        } else {
            pointer2++
        }
    }

    println(potentialSmallestDiff)
    return potentialClosestNumbers
}

fun smallestDifferenceAnother() {
    //This is same as identifying closest numbers in 2 arrays

    val inputList1 = arrayListOf<Int>(-1, 5, 10, 20, 28, 3)
    val inputList2= arrayListOf<Int>(26, 134, 135, 15, 17)

    inputList1.sort()
    inputList2.sort()

    val pointer1 = 0
    val pointer2 = 0

    var potentialSmallestDiff = Int.MAX_VALUE

    while (pointer1 < inputList1.size && pointer2 < inputList2.size) {

        if (abs(inputList1[pointer1] - inputList2[pointer2]) < potentialSmallestDiff) {
            potentialSmallestDiff = abs(inputList1[pointer1] - inputList2[pointer2])
        }
    }

}