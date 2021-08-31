package com.example.leetcodepractice.dsa.sorting_algos

fun main() {


    val array = arrayOf(10, 5, 15, 25, 20, 30,1) // unsorted array takes O(n^2) time and O(1) space
    //val array = arrayOf(5, 10, 15, 20, 25, 30) // already sorted array takes O(n) time and O(1) space

    println("Input UnSorted Array      :" + array.contentToString())

    //In bubble sort, the largest element bubbles up to the end(last index) just like the largest
    // water bubble bubbles up to the surface.
    // We do in-place adjacent comparisons.
    // Optimization : To optimize our bubble sort algorithm, we can introduce a flag to monitor whether elements
    // are getting swapped inside the inner for loop.
    // Hence, in the inner for loop, we check whether swapping of elements is taking place or not, everytime.
    // If for a particular iteration, no swapping took place, it means the array has been sorted and
    // we can jump out of the for loop, instead of executing all the iterations.

    for (i in 0..array.size-1){
        var needsSorting = false
        for (j in 0..array.size - i - 2){
            if (array[j] > array[j+1]) {
                var temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
                needsSorting = true
            }
        }
        println("At the end of Iteration $i :" + array.contentToString())
        if (needsSorting == false){
            break
        }
    }

    println("\nFinal Sorted Array :" + array.contentToString())
}