package org.example

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    var min = arr[0]
    var max = arr[0]
    var sum = 0L

    for (element in arr) {
        if (element < min) {
            min = element
        }

        if (element > max) {
            max = element
        }
        sum += element
    }

    val minSum = sum - max
    val maxSum = sum - min

    println("$minSum $maxSum")


    var min2 = arr.min()
    var max2 = arr.max()
    var sum2 = arr.map { it.toLong() }.sum()
    var sum3 = arr.sumOf { it.toLong() }

    val minSum2 = sum2 - max2
    val maxSum2 = sum2 - min2

    println("$minSum2 $maxSum2")

    // map, dizinin tüm elemanlarını belli bir tranformation formatına göre değiştirip, yeni bir liste oluşturur.
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
