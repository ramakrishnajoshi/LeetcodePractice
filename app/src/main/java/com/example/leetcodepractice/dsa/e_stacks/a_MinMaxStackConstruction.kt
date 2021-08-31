package com.example.leetcodepractice.dsa.e_stacks

import kotlin.math.max
import kotlin.math.min

fun main() {

    //Takes O(N + N) space. One N to store stack and another N to store min max value so that all stack
    //operations take constant time O(1) to execute
    val minMaxStack = MinMaxStack()
    println("Adding 5: " + minMaxStack.push(5) +  minMaxStack.peek())
    println("Adding 6: " + minMaxStack.push(6) + minMaxStack.peek())
    println("Adding 7: " + minMaxStack.push(7) + minMaxStack.peek())
    println("Popping 7: " + minMaxStack.pop() + minMaxStack.peek())
    println("Adding 8: " + minMaxStack.push(8) + minMaxStack.peek())
    println("getMin: " + minMaxStack.getMin())
    println("getMax: " + minMaxStack.getMax())
    println("Adding 1: " + minMaxStack.push(1) + minMaxStack.peek())
    println("Adding 9: " + minMaxStack.push(9) + minMaxStack.peek())
    println("getMin: " + minMaxStack.getMin())
    println("getMax: " + minMaxStack.getMax())

}

class MinMaxStack {
    //We also implement stack using LinkedList. For pop feature we can keep tail reference in LinkedList
    val stack = arrayListOf<Int>()

    //Holds min and max values
    val minMaxHolderList = arrayListOf<MinMaxHolder>()

    class MinMaxHolder(
            var min: Int,
            var max: Int
    )

    fun pop(): Int? {
        //stack.removeAt(stack.lastIndex)
        minMaxHolderList.removeLastOrNull()
        return stack.removeLastOrNull()
    }

    fun peek(): Int {
        return stack[stack.lastIndex]
    }

    fun push(element: Int) {
        var newMin = Int.MAX_VALUE
        var newMax = Int.MIN_VALUE
        if (minMaxHolderList.isNotEmpty()) {
            val currentMinMaxHolder = minMaxHolderList.get(minMaxHolderList.lastIndex)
            newMin = min(currentMinMaxHolder.min, element)
            newMax = max(currentMinMaxHolder.max, element)
        } else {
            newMin = element
            newMax = element
        }
        minMaxHolderList.add(MinMaxHolder(newMin, newMax))
        stack.add(element)
    }

    fun getMin(): Int {
        return minMaxHolderList[minMaxHolderList.lastIndex].min
    }

    fun getMax(): Int {
        return minMaxHolderList[minMaxHolderList.lastIndex].max
    }
}