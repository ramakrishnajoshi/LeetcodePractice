import org.jetbrains.annotations.TestOnly
import java.lang.RuntimeException

fun main() {

//    sortString()
    findSequence()
}



fun sortString() {
    val inputString = "shivaprasad"
    //a a a d h i p r s s v

    val formatteddArray = inputString.toCharArray()

    var index = 0
    while (index < formatteddArray.size) {
        var innerIndex = index + 1
        while (innerIndex < formatteddArray.size) {
            if (formatteddArray[innerIndex] < formatteddArray[index]) {
                //swap
                val temp = formatteddArray[index]
                formatteddArray[index] = formatteddArray[innerIndex]
                formatteddArray[innerIndex] = temp
            }
            innerIndex++
        }
        index++
    }

    println(formatteddArray)
}

//[12:16 PM] Shivaprasad Eshwaraswami
//    Given two integers m & n, find the number of possible sequences of length n such that each of the next element is greater than or equal to twice of the previous element but less than or equal to m.
//Example 1:
//Input: m = 10, n = 4
//Output: 4
//Explanation: There should be n elements and
//value of last element should be at-most m.
//The sequences are {​​​1, 2, 4, 8}​​​, {​​​1, 2, 4, 9}​​​,
//{​​​1, 2, 4, 10}​​​, {​​​1, 2, 5, 10}​​​.

// Input: m = 10, n = 4
//Output: 4
//Explanation: There should be n elements and
//value of last element should be at-most m.
//The sequences are {1, 2, 4, 8}, {1, 2, 4, 9},
//{1, 2, 4, 10}, {1, 2, 5, 10}.

//10, 5, 2,1
//9, 4, 2, 1
//8, 4, 2, 1
//7,3,1,1 failed
//
//10, 4,2,1
//10, 3, 1,1 failed
//1

fun findSequence() {
    val maxElement = 10
    var maxElementsInSequence = 4
    var validSequenceCounter = 0

    var currentMaxElement = maxElement
    var currentElement = maxElement

    while (currentElement > 1) { //10
        val tempCurrentElement = currentElement
        var counter = 0
        while (currentElement >= 1) {//9,4,2,1
            counter++ //1,2,3,4
            currentElement = currentElement/2 //4,2,1, 0
        }
        if (counter == maxElementsInSequence) {
            validSequenceCounter++
            currentElement = tempCurrentElement- 1
        } else {
            currentMaxElement = currentMaxElement/2
            currentElement = currentMaxElement - 1
            maxElementsInSequence--
        }
    }

    println(validSequenceCounter)
}














/*


class Torch {
    init {
        Battery.initialize()
    }

    // brightness
    fun shine(brightness: Int): Light {
        Battery.recharge()
        var power = 0
        try {
            power = Battery.getRequiredPower(brightness)
        } catch(exception: Exception) {
            return Light.dark()
        }

        return Light(power)
    }
}


class TorchTest {
    // Exercise 1: implement one or more tests

    @Setup
    fun setUp() {

    }

    @Test
    fun `should return Light.dark if brightness is negative`() {
        val torch = Torch()
        val actualResult = torch.shine(-1)

        whenever(Battery.getRequiredPower(brightness)).throw(RuntimeException)

        assertThat(actualResult).isEqualTo(Light.dark())
    }

    @Test
    fun `should return Light if brightness is positive`() {
        val torch = Torch()
        val actualResult = torch.shine(1)
        val actualPower = Battery.getRequiredPower(1)

        assertThat(actualResult).isEqualTo(Light.power(actualPower))
    }

}


*/
















