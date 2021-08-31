package com.example.leetcodepractice.dsa.strings

// Caesar Cipher Encryptor
// Given a non-empty string of lowercase letters and a non-negative integer representing a key,
// write a function that returns a new string obtained by shifting
// every letter in the input string by k positions in the alphabet, where k is the key.
//Sample Input string = "xyz" and key = 2
//Sample Output string= "zab"

fun main() {
    //'A' -> 65
    //'Z' -> 90
    //'a' -> 97
    //'z' ->122
    getStringgg("xyz", 2)
    getStringgg("xyz", 222)
}

fun getStringgg(inputString: String, key: Int) {

    val charArray = inputString.toCharArray()
    val key = key % 26

    for ((index, element) in charArray.withIndex()) {
        if ( element + key > 122.toChar()) {
            charArray[index] = element + key - 26
        } else {
            charArray[index] = element + key
        }
    }

    println(charArray.joinToString(""))
    //or println(String(charArray))
}