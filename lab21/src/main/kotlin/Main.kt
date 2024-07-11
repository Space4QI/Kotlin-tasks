package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val arr = mutableListOf<Int>()
    arr.addAll(listOf(8, 21, 5, 90, 11, 0))
    println(arr.joinToString())
    arr.addFirst(90)
    println(arr.joinToString())
    arr.removeAt(4)
    println(arr.joinToString())
    arr.addLast(-35)
    println(arr.joinToString())
}