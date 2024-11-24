package org.example

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    val positive = arr.count {
        it > 0
    }
    val negative = arr.count {
        it < 0
    }
    val zero = arr.count {
        it == 0
    }
    val n = arr.size
    println(String.format("%.6f", positive / n))

    println("${positive.toFloat() / n}, ${negative.toFloat() / n}, ${zero.toFloat() / n}")
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}
