package com.example.leetcodepractice.dsa.strings

fun main() {

    println(isPalindrome("raar", 0))
}

fun isPalindrome(string: String = "", i: Int = 0): Boolean {
    val j = string.lastIndex - i

    return if (i >= j) {
        true// if i and j are equal or cross each other then it means that all chars are verified for equality
    } else {
        string[i] == string[j] && isPalindrome(string, i + 1)
    }
}

//Flow
//isP(raar)    =    (r == r) && isP(1)
//
//isP(1)       =    (a == a) && isP(2)
//
//isP(2)       =    true