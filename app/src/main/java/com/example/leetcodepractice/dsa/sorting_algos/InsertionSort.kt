package com.example.leetcodepractice.dsa.sorting_algos

fun main() {

    val array = arrayOf(10, 3, 55, 1, 6, 12, 0)
//    val array = arrayOf(1,2,3,4,5,6,7)
//    val array = arrayOf(7,6,5,4,3,2,1)
    val array2 = arrayOf(0, 1, 2, 3, -4)

    println("Unsorted Input Array :            ${array.contentToString()}")

    for (i in 1..array.size-1) {
        val key = array[i]

        //Need to compare -4 to each of previous values
        insideLoop@ for (j in i downTo 0) {
            if (j >= 1 && array[j] < array[j-1]) {
                val temp = array[j]
                array[j] = array[j-1]
                array[j-1] = temp
            } else {
                break@insideLoop
            }
            println("Array 2nd loop $j : " + array.contentToString())
        }

        println("Array at the end of iteration $i : " + array.contentToString())
    }

    println(array.contentToString())

}