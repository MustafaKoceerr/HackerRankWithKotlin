package org.example

fun main() {
    println("Eksi sonuc : ${(10) % -5}")

    val myArr = arrayOf(2,4,6)

    val x = myArr.all {  it ->
        it % 2 == 0
    }

    println(x)

}