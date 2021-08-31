package com.example.leetcodepractice.dsa.d_linkedlist

import com.example.leetcodepractice.dsa.d_linkedlist.node.ListNode

fun main() {
    //Input: 8 -> 1 -> 2 -> 3 -> 4 -> 5 -> 2
    //val head = ListNode(8, ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(2, null)))))))
    //val head = ListNode(0, ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6, ListNode(7, ListNode(8, ListNode(9, ListNode(4, null)))))))))))

    val head = ListNode(8)
    head.next = ListNode(1)
    head.next?.next = ListNode(2)
    head.next?.next?.next = ListNode(3)
    head.next?.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next?.next = ListNode(5)
    head.next?.next?.next?.next?.next?.next = ListNode(2)
    head.next?.next?.next?.next?.next?.next?.next = head.next?.next

    println(findLoopNodeInLinkedList(head))

    //println(findLoopInLinkedListUsingHashmap(head))
}

//Runs in O(n) time and O(1) space. Uses Floyd’s slow and fast pointers approach. More here: https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
//Below code gives error here but runs perfectly in leetcode compiler
private fun findLoopNodeInLinkedList(head: ListNode): ListNode? {
    var slowPointer: ListNode? = head.next
    var fastPointer: ListNode? = head.next?.next

    while (slowPointer != fastPointer) {
        slowPointer = slowPointer?.next
        fastPointer = fastPointer?.next?.next
    }

    slowPointer = head
    while (slowPointer != fastPointer) {
        slowPointer = slowPointer?.next
        fastPointer = fastPointer?.next
    }

    return slowPointer
}

//Below code takes O(n) space for Hashmap :(
fun findLoopInLinkedListUsingHashmap(head: ListNode) : ListNode? {
    val hashMap = hashMapOf<Int, ListNode>()

    var iteratorPointer: ListNode? = head
    while (iteratorPointer != null) {
        if (hashMap.containsKey(iteratorPointer.value)) {
            //return iteratorPointer
            return hashMap.getValue(iteratorPointer.value)
        } else {
            hashMap.put(iteratorPointer.value, iteratorPointer)
            iteratorPointer = iteratorPointer.next
        }
    }
    return iteratorPointer
}
