package com.example.leetcodepractice.dsa.d_linkedlist


data class Node<T>( val value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return "$value -> ${next?.toString()}"
    }
}
/*

class LinkedList<T> {

    var head : Node<T>? = null
    var tail : Node<T>? = null

    override fun toString(): String {
        return head.toString()
    }

    fun addNode(value: T) {
        val tempNode = Node(value, null)
        if (head == null) {
            head = tempNode
        } else {
            var address = head!!.next
            while (address != null) {
                address = address.next
            }
            address = tempNode
        }
    }

}

fun main() {
    val myLinkedList = LinkedList<Int>()

    myLinkedList.addNode(5)
    myLinkedList.addNode(6)
    println(myLinkedList)
}*/
