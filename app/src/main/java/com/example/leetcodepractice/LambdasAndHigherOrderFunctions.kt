package com.example.leetcodepractice

fun main() {

    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(5, 6))

    println(
        calculateAverage(sum)
    )
    println(
        calculateAverage { a, b -> a + b }// Block { a, b -> a + b } is a function
    )
    println(
        calculateAverage(
            fun(a: Int, b: Int): Int {
                return a + b + 10
            }
        )
    )

    test()

    //testMapAndFaltmap()
}

fun calculateAverage(sum: (Int, Int) -> Int): Int {
    return sum(2, 4) / 2
}

fun test() {
    val inputList = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val newList = inputList
        .filter {
            if (it % 2 == 0) {
                it * 4 // has no effect
                return@filter true // item is considered if true is returned, otherwise discarded
            }
            return@filter false
        }
        .map {
            it*2
        }
/*        .reduceOrNull { acc, i ->
            acc + i
        }*/

    println("New List : $newList")

//    inputList.flatMap {
//        it = it*2
//    }

    val cars = listOf<Int>(1, 2, 3)
    val bikes = listOf<Int>(4, 5, 6)

    val vehicles : List<List<Int>> = listOf(cars, bikes)
    val faltenedList = vehicles.flatMap {
        it
    }
    println(vehicles)
    println("faltenedList: " + faltenedList)
}

data class Employee(
    val id: Int,
    var name: String,
    val isPermanentRole: Boolean
)

 class Person



/*fun testMapAndFaltmap() {

    val inputList = arrayListOf<Employee>(
        Employee(111, "Rama", true),
        Employee(222, "Venki", false),
        Employee(333, "Hemanth", false),
        Employee(444, "Basu", true),
    )

    val outputList1 = inputList
        .map {
            Person(it.id, it.name, it.isPermanentRole) // we are converting Employee to Person here. So employeeList to personList
        }
    println("outputList1 $outputList1") // outputs [Person(id=111, name=Rama, isPermanentRole=true), Person(id=222, name=Venki, isPermanentRole=false), Person(id=333, name=Hemanth, isPermanentRole=false), Person(id=444, name=Basu, isPermanentRole=true)]

    val outputList2 = inputList
        .map {
            it.name // we are converting Employee to String here. So employeeList to string list.
        }
    println("outputList2 $outputList2") // outputs [Rama, Venki, Hemanth, Basu]


}*/
