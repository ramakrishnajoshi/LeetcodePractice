package com.example.leetcodepractice.dsa.a_arrays.a_twosum

fun main() {
    //    val arrayint = Array<Int>(5) { readLine()!!.toInt() }
    //  println(arrayint.contentToString())

    //val scanner = Scanner(System.`in`)
    //var arr = Array(5) {scanner.nextInt()} // taking input

    //val (a,b) = readLine()!!.split(" ")
    //println("Summing:${(a.toInt() + b.toInt())}")



    //Two Sum Solutions
    //Using 2 loops : Time = O(n^2) Space = O(1)
    //Using sorted array & diff method : Time = ForSorting -> O(nLog) & algorithm O(n), Space = O(1)
    //Using HashMap/Hashtable : Time = O(n) Space = O(n)

    //println(findTwoSumOnSortedArray())
    println(twoSumUsingHashMap())
}


//Elements need not be sorted here. Takes O(n) time
fun twoSumUsingHashMap() : List<Int> {
    //val inputArray = arrayListOf<Int>(1,4,5,6,7,10,11,19)
    val inputArray = arrayListOf<Int>(1,-4,5,6,-7,10,11,19)
    val targetSum = 16

    val hashMap = HashMap<Int, Int>()

    var loopCount = 0
    for ( (index, element) in inputArray.withIndex()) {
        println("Loop Count: " + loopCount++)
        val currentDiff = targetSum - element

        if (hashMap.containsKey(currentDiff)) {
            return arrayListOf(currentDiff, element)
        } else {
            hashMap.put(element, index)
        }
    }

    return emptyList()
}


//Using Difference Method on Sorted Array
fun findTwoSumOnSortedArray() : List<Int> {
    //QuickSort Takes nLogn time complexity
    //Below code takes O(n) time complexity as it has to go through elements ony by one
    // so at last time complexity is O(nLogn + n) = O(nLogn)
    //Space of below code is O(1)
    val inputArray = arrayListOf<Int>(1,4,5,6,7,10,11,19)
    val targetSum = 16

    var leftIndex = 0
    var rightIndex = inputArray.size - 1

    var loopCount = 0
    while (leftIndex < rightIndex) {
        println("Loop Count: " + loopCount++)
        val currentIndexesSum = inputArray[leftIndex] + inputArray[rightIndex]
        if (currentIndexesSum == targetSum) {
            return arrayListOf<Int>(inputArray[leftIndex], inputArray[rightIndex])
        } else if (currentIndexesSum > targetSum) {
            rightIndex--
        } else {
            leftIndex++
        }
    }

    return emptyList<Int>()
}



fun twoSumAgain() {
    val inputArray = arrayListOf<Int>(1,4,5,6,7,10,11,19)
    val targetSum = 16

    val hashMap = hashMapOf<Int,Int>()
    for ((index, value) in inputArray.withIndex()) {

        if (hashMap.containsKey(targetSum - value)) {
            println("Two sum of $targetSum is ${value} ${(targetSum-value)}")
        } else {
            hashMap.put(value, index)
        }
    }
}

fun pythagorasNumbers() {
    //a^2 + b^2 = c^2

    val inputList = arrayListOf<Int>(13, 3, 5, 12, 16)
    inputList.sort()

    for ((index, value) in inputList.withIndex()) {

        val target = value*value


    }

}