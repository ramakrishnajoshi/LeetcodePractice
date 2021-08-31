package com.example.leetcodepractice.dsa.a_arrays.i_FindDuplicateIn2nPlus1Array

fun main() {
    //Find odd_occurrences_in_array
    //Input : [2, 3, 2, 7, 7, 4, 3]
    //Output: 4 as 4 is odd one.

    //Solution1
    //oddOccurrencesInArrayUsingHashmap()

    //Solution2
    usingXorBitwiseOperator()
}

fun oddOccurrencesInArrayUsingHashmap() {
    val inputList = arrayListOf<Int>(2, 3, 2, 7, 7, 4, 3)

    if (inputList.size == 1) {
        println("Output :" + inputList[0])
        return
    }

    val hashMap = hashMapOf<Int, Int>()
    for ( (index, element) in inputList.withIndex()) {

        if (hashMap.containsKey(element)) {
            hashMap.remove(element)
        } else {
            hashMap.put(element, index)
        }

    }
    println("Output :" + hashMap.keys.toString())
}

//The idea is to do XOR of all elements. XOR of all elements gives us the result.
// The idea is based on below XOR properties.
//1. XOR of a number with itself is 0.
//2. XOR of a number with 0 is the number.
fun usingXorBitwiseOperator() {
    val inputList = arrayListOf<Int>(2, 3, 2, 7, 7, 4, 3)

    var result = 0
    for (element in inputList) {
        result = result.xor(element)
    }

    println(result)
}
