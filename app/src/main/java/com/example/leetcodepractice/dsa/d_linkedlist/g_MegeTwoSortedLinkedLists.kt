package com.example.leetcodepractice.dsa.d_linkedlist

import com.example.leetcodepractice.dsa.d_linkedlist.node.ListNode

fun main() {
    val head1 = ListNode(1, ListNode(3, ListNode(4, ListNode(5, ListNode(9, ListNode(10, null))))))
    val head2 = ListNode(2, ListNode(6, ListNode(7, ListNode(8, null))))

    mergedTwoSortedLinkedLists(head1, head2)
}

//1, 3, 4, 5, 9, 10
//2, 6, 7, 8
fun mergedTwoSortedLinkedLists(head1: ListNode, head2: ListNode) : ListNode {
    var p1: ListNode? = head1
    var p2: ListNode? = head1.next

    var currentNodeOf2 : ListNode? = head2
    while (currentNodeOf2 != null) {

        while (currentNodeOf2.value > p1?.value!! && currentNodeOf2.value < p2?.value!!) {
            //p1 = p1.next

            val tempNode = ListNode(currentNodeOf2.value, p2)
            p1?.next = tempNode
            //1,2,3,4,5,9,10
            p1 = p2
            p2 = p2?.next
        }
        
        p2 = p1.next





        currentNodeOf2 = currentNodeOf2.next
    }


    return head1
}