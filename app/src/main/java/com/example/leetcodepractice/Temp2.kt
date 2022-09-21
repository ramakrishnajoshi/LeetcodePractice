fun main() {


}

fun checkText(): Boolean {
    val input1 = "abcde"
    val input2 = "acebd"

    if (input1.length == input2.length) {
        return false
    }
    var sum1 = 0
    var sum2 = 0

    input1.forEachIndexed { index, element ->
        sum1 = sum1 + element.toChar().toInt()
        sum2 = sum2 + input2[index].toChar().toInt()
    }

    if (sum1 == sum2) {
        return true
    }

    return false
}