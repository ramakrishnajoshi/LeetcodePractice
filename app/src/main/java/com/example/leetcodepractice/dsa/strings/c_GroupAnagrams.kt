package com.example.leetcodepractice.dsa.strings

fun main() {
    //Anagrams are strings made up of exactly the same letters, where order doesn't matter.
    // For example, "cinema" and "iceman" are anagrams; similarly, "foo" and "ofo" are anagrams.

    //Input words = ["yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"]
    //Output [["yo", "oy"], ["flop", "olfp"], ["act", "tac", "cat"], ["foo"]]
    val inputList = arrayListOf<String>("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp")
    println(groupAnagrams(inputList))
}

//Incomplete
fun groupAnagrams(inputList: ArrayList<String>) : ArrayList<ArrayList<String>> {

    //StringLength : sumOfChars
    val hashMap = hashMapOf<Int, Int>()

    val outputList = ArrayList<ArrayList<String>>()

    for ((index, element) in inputList.withIndex()) {

        for (j in index+1..inputList.lastIndex) {
            if (inputList[j].length == element.length) {
                if (inputList[j].hashCode() == element.hashCode()) {
                    outputList.add(
                        arrayListOf(inputList[j], element)
                    )
                }
            }
        }
    }

    return outputList
}