package com.example.leetcodepractice.dsa.f_queque

fun main() {
    //1,2,3,4,5
    //After deque
    //2,3,4,5

    val queue = QueueDataStructure()
    println(queue.peek())
    println(queue.toString())
    queue.enQueue(1)
    queue.enQueue(2)
    queue.enQueue(3)
    queue.enQueue(4)
    queue.deQueue()
    println(queue.toString())
}

class QueueDataStructure {

    val queue = arrayListOf<Int>()
    var front = 0
    var rear = 0

    var size = 0

    fun enQueue(element: Int) {
        queue[rear] = element
        rear++
        size++
    }

    fun deQueue(): Int? {
        if (queue.isEmpty()) {
            return null
        }

        front++
        size--
        return queue[front]
    }

    fun peek(): Int? {
        if (queue.isEmpty()) {
            return null
        }
        return queue[0]
    }

    override fun toString(): String {
        return "Front -> $front, Rear -> $rear, Size -> $size, Queue -> ${queue.subList(front, rear)}"
    }

}