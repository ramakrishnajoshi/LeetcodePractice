package com.example.leetcodepractice.dsa.a_arrays.g_max_subarray_of_k_size

fun main() {
    //this is similar to previous problem but here the input contains -ve numbers also

    //Input  : [-1, -4, 0, 5, 3, 2, 1] and sum = 5
    //Output : Index 3 and 4-5
    temp()
}

//using dynamic sliding window
fun temp() {

    val inputList = arrayListOf<Int>(3, 4, -7, 1, 3, 3, 1, -4)
    val sum = 7

    var currentSum = 0
    var leftPointer = 0

    for ( (index, element) in inputList.withIndex()) {
        currentSum = currentSum + element

        if (currentSum <= 0) {
            currentSum = 0
            leftPointer = index + 1
            continue
        }

        if (currentSum > sum) {
            currentSum = currentSum - inputList[leftPointer]
            leftPointer++
        }

        if (currentSum == sum) {
            println("Indices : $leftPointer - $index")
        }
    }

    //temp bitwise
    val x = 10
    val y = x shl 3 //left shift doubles the dumber
    val z = x shr 4 //right shift doubles the dumber
    println("x : $x and y : $y and z : $z")

    val a = 100
    val b = 70
    println("$a or $b = ${a or b}")
}

