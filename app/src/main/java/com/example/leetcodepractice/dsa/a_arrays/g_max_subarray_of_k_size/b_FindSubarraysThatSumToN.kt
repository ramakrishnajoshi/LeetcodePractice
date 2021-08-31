package com.example.leetcodepractice.dsa.a_arrays.g_max_subarray_of_k_size

fun main() {
    //Input  : [ 2, 6, 0, 9, 7, 3, 1, 4, 1, 10 ] and sum = 15;
    //Output : Index : 1-3 elements [6, 0, 9] and Index : 4-7 elements [7, 3, 1, 4]
    findSubarraysThatSumToNusingSlidingWindowTechnique()
}

//Using dynamic sliding window
fun findSubarraysThatSumToNusingSlidingWindowTechnique() {
    //Create three variables, l=0, sum = 0
    //Traverse the array from start to end.
    //Update the variable sum by adding current element, sum = sum + array[i]
    //If the sum is greater than the given sum, update the variable sum as sum = sum – array[l], and update l as, l++.
    //If the sum is equal to given sum, print the subarray and break the loop.

    val inputList = arrayListOf<Int>(2, 6, 0, 9, 7, 3, 1, 4, 1, 10)
    val desiredSum = 15

    var currentSum = 0
    var leftPointer = 0

    for ( (index, element) in inputList.withIndex()) {
        currentSum = currentSum + element

        if (currentSum > desiredSum) {
            currentSum = currentSum - inputList[leftPointer]
            leftPointer++
        }

        if (currentSum == desiredSum) {
            print("Index from $leftPointer to $index")
            println(" Elements : ${inputList.subList(leftPointer, index)}")
        }
    }
}