package com.example.leetcodepractice

open class Parent {
    protected open var hasChildren: Boolean = false

    protected open var name: String = ""

    public open fun setLastName(name: String) {
        this. name = name
    }

    companion object {
        fun getObject () : Parent {
            return Parent()
        }
    }
}

open class Child: Parent() {
    var canSpeak: Boolean = false

    override fun setLastName(name: String) {
        this.name = name

    }
}

fun mainA() {
    val parent: Parent = Child() //upcasting child
    //parent.canSpeak // compiletime error
    parent.setLastName("Parent -> Child")


    val child: Child = Parent() as Child // this leads to exception
}


/*
interface IShape {
    fun computeArea(): Double
    fun fdfg() {
        println("Hello Ji")
    }
}

class Rectangle(val width: Int, val height: Int
) : IShape {
    override fun computeArea(): Double { return width*height.toDouble() }
}

class Square(val side: Int) : IShape {
    override fun computeArea(): Double { return side*side.toDouble() }
}

class Circle(val radius: Int) : IShape {
    override fun computeArea(): Double { return 2*22/7*radius.toDouble() }
}

fun main() {
    val shapeList = listOf<IShape>(
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

*/
