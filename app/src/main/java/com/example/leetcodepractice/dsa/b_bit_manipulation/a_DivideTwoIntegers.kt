package com.example.leetcodepractice.dsa.b_bit_manipulation

// Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
// Return the quotient after dividing dividend by divisor.
// The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.
// Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1].
// For this problem, assume that your function returns 231 − 1 when the division result overflows.
fun main() {

    //Good explanation here: https://www.youtube.com/watch?v=bdxJHWIyyqI
    println(divide())
}

fun divide(): Long {

    // Calculate sign of divisor i.e., sign will be negative only iff either one of them
    // is negative otherwise it will be positive
    var dividend = 43
    var divisor = 8
    val sign = if ( (dividend < 0) xor (divisor < 0) ) {
        -1
    } else {
        1.toLong()
    }

    // remove sign of operands
    dividend = Math.abs(dividend)
    divisor = Math.abs(divisor)

    // Initialize the quotient
    var quotient: Long = 0
    var temp: Long = 0

    // test down from the highest bit and accumulate the tentative value for valid bit
    // 1<<31 behaves incorrectly and gives Integer Min Value which should not be the case, instead 1L<<31 works correctly.
    for (i in 31 downTo 0) {
        if (temp + (divisor shl i) <= dividend) {
            temp += divisor shl i
            quotient = quotient or (1L shl i)
        }
    }

    //if the sign value computed earlier is -1 then negate the value of quotient
    if (sign == -1L) {
        quotient = -quotient
    }
    return quotient
}
