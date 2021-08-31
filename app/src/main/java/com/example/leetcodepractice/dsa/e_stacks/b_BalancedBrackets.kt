package com.example.leetcodepractice.dsa.e_stacks

fun main() {
    println(checkIfBracketsAreBalanced("(()()[]{})"))
    println(checkIfBracketsAreBalanced("(141[])(){waga}((51afaw))()hh()"))
}

fun checkIfBracketsAreBalanced(input: String): Boolean {
    val inputBrackets = input.toCharArray()

    val openingBrackets = charArrayOf('(', '[', '{')
    val closingBrackets = charArrayOf(')', ']', '}')
    val matchingBrackets = hashMapOf<Char, Char>(
            ')' to '(',
            ']' to '[',
            '}' to '{'
    )

    val stack = arrayListOf<Char>()

    for (char in inputBrackets) {
        if (char.isLetterOrDigit()) {
            continue //skip such character
        }

        if (openingBrackets.contains(char)) {
            stack.add(char)
        } else { // char is closing bracket
            if (stack.isEmpty()) {
                return false
            }
            if (stack[stack.lastIndex] == matchingBrackets.get(char)) {
                stack.removeLast()
            } else {
                return false
            }
        }
    }

//    if (stack.isNotEmpty()){
//        return false
//    }
    return stack.isEmpty()
}