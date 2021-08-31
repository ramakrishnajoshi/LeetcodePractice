package com.example.leetcodepractice.dsa.d_linkedlist.node

class ListNode(
        var value: Int,
        var next: ListNode? = null ) {

    override fun toString(): String {
        return "$value -> ${next.toString()}" //This causes stackoverflow if there is a loop in linkedlist
        //return "$value"
    }
}