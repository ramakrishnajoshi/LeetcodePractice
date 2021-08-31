package com.example.leetcodepractice.dsa.d_linkedlist

import com.example.leetcodepractice.dsa.d_linkedlist.node.ListNode

fun main() {
    val head = ListNode(1, ListNode(3, ListNode(4, ListNode(5, null))))
    println(reverseLinkedList(head))
}

fun reverseLinkedList(head: ListNode) : ListNode? {

    var p1 : ListNode? = null
    var p2 : ListNode? = head // p2 points to current node in iteration

    while (p2 != null) {
        val p3 = p2.next
        p2.next = p1
        p1 = p2
        p2 = p3
    }
    return p1
}