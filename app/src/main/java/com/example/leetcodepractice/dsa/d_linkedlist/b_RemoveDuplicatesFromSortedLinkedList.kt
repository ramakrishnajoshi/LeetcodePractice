package com.example.leetcodepractice.dsa.d_linkedlist

import com.example.leetcodepractice.dsa.d_linkedlist.node.ListNode

//You're given the head of a Singly Linked List whose nodes are in sorted order with respect to their values.
// Write a function that returns a modified version of the Linked List that doesn't contain any nodes
// with duplicate values. The Linked List should be modified in place (i.e., you shouldn't create a brand new list),
// and the modified Linked List should still have its nodes sorted with respect to their values.
// Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to None / null if it's the tail of the list.
// Sample Input linkedList = 1 -> 1 -> 3 -> 4 -> 4 -> 4 -> 5 -> 6 -> 6 // the head node with value 1
// Sample Output linkedList= 1 -> 3 -> 4 -> 5 -> 6 // the head node with value 1
fun main() {
    val head = ListNode(1, ListNode(1, ListNode(3, ListNode(4, ListNode(4, null)))))
    println(removeDuplicatesFromSortedLinkedList(head))

    //Outputting result by iterating through linkedlist
    var pointer : ListNode? = head
    while (pointer != null) {
        print("${pointer.value} -> ")
        pointer = pointer.next
    }
}

//Takes O(n) time and O(1) space
// It appears like it takes O(N^2) time but that is not the case as same element is not iterated
// twice. The elements touched by inner while are not touched by outer while.
fun removeDuplicatesFromSortedLinkedList(head: ListNode) : ListNode {
    var currentNode : ListNode? = head
    while (currentNode != null) {
        var nextNode = currentNode.next
        while (nextNode != null && currentNode.value == nextNode.value) {
            nextNode = nextNode.next
        }
        currentNode.next = nextNode
        currentNode = nextNode
    }
    return head
}