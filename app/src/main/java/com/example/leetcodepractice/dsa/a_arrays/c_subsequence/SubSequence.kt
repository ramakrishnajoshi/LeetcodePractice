package com.example.leetcodepractice.dsa.a_arrays.c_subsequence


fun main() {
    findSubsequence()
}

//O(n) Time | O(1) Space
fun findSubsequence() {

    val mainArray = arrayListOf<Int>(5, 1, 22, 25, 6, -1, 8, 10)
    val subArray = arrayListOf<Int>(1, 6, -1, 10)

    var subArrayCurrentIndex = 0
    mainArray.forEach {
        if (subArrayCurrentIndex <= subArray.size - 1 &&
                it == subArray[subArrayCurrentIndex]) {
            subArrayCurrentIndex++
        }
    }

    if (subArrayCurrentIndex == subArray.size) {
        println("Valid Subsequence")
    } else {
        println("Invalid Subsequence")
    }
}

fun tournamentWinner() {
    // homeTeam -> 1 ; awayTeam -> 0
    val competitions = arrayListOf(
            arrayListOf("HTML", "C#"),
            arrayListOf("C#", "PYTHON"),
            arrayListOf("PYTHON", "HTML"),
    )

    val results = arrayListOf<Int>(0, 0, 1)

    val hashMap = hashMapOf<String, Int>()

    competitions.forEachIndexed { index, individualCompetition ->
        if (results[index] == 1) {
            hashMap[individualCompetition[0]] = if(hashMap.get(individualCompetition[0]) == null) {
                1
            } else {
                (hashMap.get(individualCompetition[0]) as Int) + 1
            }
        } else {
            hashMap[individualCompetition[1]] = if(hashMap.get(individualCompetition[1]) == null) {
                1
            } else {
                (hashMap.get(individualCompetition[1]) as Int) + 1
            }

            //hashMap.merge("", 1, 1)
        }
    }

    println(hashMap)
}
