package com.example.leetcodepractice.dsa

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val mutableNumberList1 = mutableListOf<Int>(1, 2, 3)
    val mutableNumberList2 = arrayListOf<Int>(1, 2, 3)
    val fixedNumberList = listOf<Int>(1, 2, 3)
    //val i = sequenceOf()
    mutableNumberList1[2] = 8
    mutableNumberList2[2] = 8 //this is also possible
    //fixedNumberList[1] = 5    //can not do this operation- compile time error

    //print("TowSum " + twoNumberSum(arrayListOf(3,5,-4,8, 11,1,-1,6), 10))

    testingArrays()
}

fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
    // Write your code here.
    //3->5, 3->-4

    //1,2,3,4,5
    if (array.isNullOrEmpty()) {
        return listOf()
    } else {
        val twoSumArray = arrayListOf<Int>()
        val inputArraySize = array.size - 1;

        array.forEachIndexed { index, element ->
            for ( j in index+1..inputArraySize) {
                if (element + array[j] == targetSum){
                    twoSumArray.add(element)
                    twoSumArray.add(array[j])
                    return twoSumArray
                }
            }
        }
    }
    return listOf<Int>()
}

fun testingArrays() {

    val inputCharArray = charArrayOf('1', '2', 'a', 'b')
    println(inputCharArray[0])
    //val mutableCharList = Arrays.asList(inputCharArray)   - Java Way
    //val mutableCharList = listOf(inputCharArray)          - Kotlin Way

    println(inputCharArray)
    println(Arrays.toString(inputCharArray))  //Java way
    println(inputCharArray.contentToString()) //Kotlin Way

    val inputIntArray = intArrayOf(1, 2, 3, 4)
    println(inputIntArray[0])
    println(inputIntArray) // prints hashcode
    println(inputIntArray.contentToString()) // prints [1, 2, 3, 4]
    val test = inputIntArray.contentToString()
    println(test[0]) // prints [


    val inputIntArray2 = Array(5, {i -> i*5})

    println(inputIntArray2[0])
    println(inputIntArray2[1])
    println(inputIntArray2[2])
    println(inputIntArray2[3])
    println(inputIntArray2[4])
    println(inputIntArray2.contentToString())

    val intArray = IntArray(5, {i -> i*5})
    println(intArray.contentToString())

    val intArray2 = (1..100).toList().toTypedArray()
    println(intArray2.contentToString())

    println(intArray.max())
    println(intArray.min())
    println(intArray.count())
    println(intArray.sum())

    val size = 5
    var arr1 = Array(size){0} // it will create an integer array
    var arr2 = Array<String>(size){"$it"} // this will create array with "0", "1", "2" and so on.

    val unSortedArray = intArrayOf(9,2,7,5,8,4,1)
    val sortedArray : IntArray = unSortedArray.sortedArray() //sorted according to their natural sort order.
    val sortedArrayDescending : IntArray = unSortedArray.sortedArrayDescending()
    val sortedArrayBasedOnCondition = unSortedArray.sortedBy {
        it > 6
    }
    println(sortedArray.contentToString())
    println(sortedArrayDescending.contentToString())
    println(sortedArrayBasedOnCondition) //Lists don't have contentToString() only Arrays have

    val searchResult = sortedArray.find {
        it % 2 == 0 //first even number
    }

    //2d arrays
    val twoDimentionalArray = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5),
        arrayOf(6,7,8),
        arrayOf(9)
    )
    println(twoDimentionalArray.contentDeepToString())

    twoDimentionalArray.forEach {
        it.forEach {
            print(" $it")
        }
        println()
    }

    twoDimentionalArray.forEach {
        println(it.contentDeepToString())
    }

    val tempArray = arrayOf(4,1,6,7,3,9)
    for (i in tempArray.lastIndex downTo  0) {
        println(tempArray[i])
    }
}

fun get2dArray(): ArrayList<ArrayList<Int>> {
    return arrayListOf(
            arrayListOf(1,2,3),
            arrayListOf(1,2,3)
    )
}