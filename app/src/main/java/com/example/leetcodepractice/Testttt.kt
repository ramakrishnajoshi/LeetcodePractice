package com.example.leetcodepractice

fun main() {


    val inputList = arrayListOf<Int>(1,3,5,3,7,5,3, 5, 7, 5, 6, 4, 5) //1,3,3,3,5,5,7
    val hashMap = hashMapOf<Int,Int>()
    inputList.forEach { key->
        if (hashMap.containsKey(key)) {
            var value = hashMap[key]!!
            hashMap.put(key, ++value)
        } else {
            hashMap.put(key, 1)
        }
    }

    var mostRepearedNumber = -1
    var maxRepeatNumber = 0
    hashMap.forEach { key, value ->
        if (maxRepeatNumber < value) {
            maxRepeatNumber = value
            mostRepearedNumber = key
        }
    }

    println(mostRepearedNumber)
}

