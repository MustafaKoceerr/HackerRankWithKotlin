package org.example

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
    // Write your code here
//    n = 6
//   5 boşluk, 1   n-i tane boşluk, i tane diyez
//   4 boşluk,   2
//   3 boşluk, 3
//   2 boşluk, 4
//   1 boşluk 5
//   0 boşluk,  6

/*
    for (i in 1 .. n) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..i) {
            print("#")
        }
    }
    println("")
 */

    for (i in 1..n){
        var line = " ".repeat(n-i)
        line+= "#".repeat(i)

        println(line)
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
