fun main() {

    //1,5,0,7,0,6,0,2,0,8,7
    //1,5,7,0,0,6,0,2,0,8,7
    //1,5,7,0,6,0,0,2,0,8,7
    //1,5,7,6,2,8,7,0,0,0,0

    var isContinuous = false
    //1,5,

    val inputList = arrayListOf(1,5,0,7,0,6,0,2,0,8,7)
    val tempList = arrayListOf<Int>()
    //var counter = inputList.size - 1
    var counter = 0

    inputList.forEach {
        if (it != 0) {
            tempList.add(it) // 1,5,7,6,2,8,7
        } else {
            counter++
        }
    }
    for (element in 0..counter){
        tempList.add(0)
    }

    println(tempList)

}