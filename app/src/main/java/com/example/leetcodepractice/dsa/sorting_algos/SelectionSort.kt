package com.example.leetcodepractice.dsa.sorting_algos

fun main() {

    //Here we select the smallest element in 1st iteration and place it in first index.
    //We start the iteration again from 2nd element and place the 2nd smallest element in
    // 2nd index position.
    val array = arrayOf(10,3,55,1,6,12,0)

    for (i in 0..array.size -1) {
        var smallestElementIndex = i
        for (j in i..array.size - 2) {
            if (array[smallestElementIndex] > array[j+1]){
                smallestElementIndex = j +1
            }
        }

        println("Smallest element in Iteration $i :" + array[smallestElementIndex])
        if (smallestElementIndex != i) {
            var temp = array[smallestElementIndex]
            array[smallestElementIndex] = array[i]
            array[i] = temp
        }
    }

    println(array.contentToString())
}