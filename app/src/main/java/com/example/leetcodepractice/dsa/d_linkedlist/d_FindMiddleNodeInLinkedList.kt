package com.example.leetcodepractice.dsa.d_linkedlist

import com.example.leetcodepractice.dsa.d_linkedlist.node.ListNode

fun main() {
    val head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6, null))))))
    findMiddleElementInLinkedList(head)
    findMiddleElementInLinkedListAnother(head)
}

//I am using Tortoise technique. In this technique, we have a slow and a fast tortoise.
//Slow Tortoise moves one node at a time while Fast Tortoise moves two nodes at a time.
//Time O(N/2) as fast Tortoise iterates through the list by skipping half of the elements
//Space O(1)
private fun findMiddleElementInLinkedList(head: ListNode) {
    var slowPointer : ListNode? = head
    var fastPointer : ListNode? = head

    //Iterate until fast Tortoise reaches the last node or crosses boundary
    while (fastPointer != null && fastPointer.next != null) {
        slowPointer = slowPointer?.next
        fastPointer = fastPointer.next?.next
    }

    println(slowPointer?.value)
}

//Above method returns mid+1 element(6/2 =3 +1 = 4) for even size linkedlist
//Below method returns mid element(6/2 =3) for even size linkedlist
private fun findMiddleElementInLinkedListAnother(head: ListNode) {
    var slowPointer : ListNode? = head
    var fastPointer : ListNode? = head

    while (fastPointer != null) {

        fastPointer = fastPointer.next?.next
        if (fastPointer!= null) {
            //Do not move slowPointer ahead if boundary is already crossed
            slowPointer = slowPointer?.next
        }
    }
    println(slowPointer?.value)
}