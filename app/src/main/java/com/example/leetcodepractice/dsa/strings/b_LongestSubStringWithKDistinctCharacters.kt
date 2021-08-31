package com.example.leetcodepractice.dsa.strings

fun main() {

}

fun longestSubStringWithDistinctCharacters() {

    //Input : "eeeabcff"
    //Output: "eee"


    //e
    //ee
    //eee
    //ea

    val inputString = "eeeabcff"
    val inputString2 = "abcff"
    val k = 3

    var windowUnique = inputString[0]

    var leftIndex = 0
    var righIndex = 0

    for ((index,character) in inputString.withIndex()) {
        if (index == 0) continue


    }
}