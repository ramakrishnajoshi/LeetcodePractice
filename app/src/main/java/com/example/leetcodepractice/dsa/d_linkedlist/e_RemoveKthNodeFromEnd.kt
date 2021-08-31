package com.example.leetcodepractice.dsa.d_linkedlist

import com.example.leetcodepractice.dsa.d_linkedlist.node.ListNode

fun main() {
    val head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6, null))))))

    println(removeKthElementFromEndAnother(head, 2)) //Delete 2nd node from end i.e Node with value 5

    //Similar Problem
    //println(removeNodeWithValue(head, 1))
}

private fun removeKthElementFromEnd(head: ListNode, k: Int) : ListNode{
    var firstPointer : ListNode? = head
    var secondPointer : ListNode? = head

    var previousPointerToSecond: ListNode? = head

    for (i in 1..k) {
        firstPointer = firstPointer?.next
    }

    if (firstPointer == null) {//Edge Case: When first pointer points to null i.e outside boundary
        secondPointer = previousPointerToSecond?.next!!
        return secondPointer
    }

    while (firstPointer != null) {
        firstPointer = firstPointer.next
        previousPointerToSecond = secondPointer
        secondPointer = secondPointer?.next
    }

    previousPointerToSecond?.next = secondPointer?.next
    secondPointer?.next = null

    return head
}


//In above approach we used a variable to keep track of previous node. It is not needed if we
//use firstPointer?.next != null instead
private fun removeKthElementFromEndAnother(head: ListNode, k: Int) : ListNode{
    var firstPointer : ListNode? = head
    var secondPointer : ListNode? = head

    for (i in 1..k) {
        firstPointer = firstPointer?.next
    }

    if (firstPointer == null) {//Edge Case: When first pointer points to null i.e outside boundary
        secondPointer = secondPointer?.next!!
        return secondPointer
    }

    while (firstPointer?.next != null) {
        firstPointer = firstPointer.next
        secondPointer = secondPointer?.next
    }

    secondPointer?.next = secondPointer?.next?.next
    return head
}

private fun removeNodeWithValue(head: ListNode, nodeValue: Int= 1): ListNode {

    var pointerNode: ListNode? = head
    var previousNode: ListNode? = head

    if (pointerNode?.value == nodeValue) {
        pointerNode = pointerNode.next
        return pointerNode!!
    }

    while (pointerNode?.value != nodeValue) {
        previousNode = pointerNode
        pointerNode = pointerNode?.next
    }

    previousNode?.next = pointerNode.next
    //pointerNode.next = null

    return head
}