package com.example.leetcodepractice
//
abstract class Shape {

    //abstract fun computeArea(): Double
    open fun computeArea(): Double {
        //this method is not called unless super.computeArea() is called
        println("Hello. So cute!")
        return 0.0
    }

}

class Rectangle(val width: Int, val height: Int) : Shape() {
    override fun computeArea(): Double { return width*height.toDouble() }
}

class Square(val side: Int) : Shape() {
    override fun computeArea(): Double { return side*side.toDouble() }
}

class Circle(val radius: Int) : Shape() {
    override fun computeArea(): Double {
        super.computeArea() // Just to test, no significance of this call here
        return 2*22/7*radius.toDouble()
    }
}

fun main() {
    val shapeList = listOf<Shape>(
        Rectangle(2,3),
        Square(5),
        Circle(10)
    )
    var totalArea = 0.0
    shapeList.forEach {
        totalArea += it.computeArea()
    }

    println(totalArea)
}

