package com.example.leetcodepractice.dsa.a_arrays

fun main() {
    println(findDuplicateWithoutExtraSpace(arrayListOf<Int>(3, 1, 3, 4, 2, 9)))
}

//3, 1, 3, 4, 2,9
fun findDuplicateWithoutExtraSpace( nums: ArrayList<Int>) : Int{
    if (nums.size > 1) {
        var slow = nums[0];
        var fast = nums[nums[0]]

        while (slow != fast) {
            slow = nums[slow]
            fast = nums[nums[fast]]
        }

        fast = 0
        while (fast != slow) {
            fast = nums[fast]
            slow = nums[slow]
        }

        return slow
    }
    return -1
}

