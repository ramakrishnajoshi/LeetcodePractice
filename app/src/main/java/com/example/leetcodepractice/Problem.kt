package com.example.leetcodepractice


fun main() {

    //1,3,4 = 1+3+4
    //1,4,3,5 = 1+4+3+5




















    //a,bc, a^2 + b^2 = c^2
    // 3,4,5
    // 5,12,13
    // 5, 1, 12, 3, 13

//    5,1  = 12
//    5,1 = 3
//    5,1 = 13
//
//    5,12 = 3
//    5,12 = 13
//    5,3 = 13

    val inputList = arrayListOf<Int>(13, 3, 5, 12, 16)
    inputList.sort() // 3,5,12,13,16

    outerLoop@for ( index in 0..inputList.lastIndex-1) {//0

        val pivot = inputList[index]*inputList[index]                   //169

        for ( j in index+1..inputList.lastIndex - 1) {//2
            val nextPivot = inputList[j] * inputList[j]                   //25
            for (k in j + 1..inputList.lastIndex) {//3
                if (pivot + nextPivot == (inputList[k] * inputList[k])) { //144
                    println("Elements are : $pivot, $nextPivot and ${inputList[k]*inputList[k]}")
                    break@outerLoop
                }
            }
        }
    }
}


