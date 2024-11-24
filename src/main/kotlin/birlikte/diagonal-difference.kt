package org.example

import kotlin.collections.*
import kotlin.io.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

val myArr = arrayOf(
    arrayOf(11, 2, 4),
    arrayOf(4, 5, 6),
    arrayOf(10, 8, -12)
)

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    // 1- primary diagonal'ı hesapla
    // 2- secondary diagonal'ı hesapla
    // 3- mutlak farkı hesapla

    val n = arr.size
    var primary = 0
    var secondary = 0
    // n = 4 için   arr[0][0] + arr[1][1] + arr[2][2] + arr[3][3]
    // n = 4 için   arr[3][0] + arr[2][1] + arr[1][2] + arr[0][3]
    for (i in 0 until n) {
        primary += arr[i][i]
        secondary += arr[n - 1 - i][i]
    }

    var primary2 = (0 until n).sumOf { arr[it][it] }
    var secondary2 = (0 until n).sumOf { arr[n-1-it][it] }
    return Math.abs(primary - secondary)
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//
//    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })
//
//    for (i in 0 until n) {
//        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//    }
//
    val result = diagonalDifference(myArr)

    println("result $result")

    println(myArr)
    println(myArr.contentDeepToString())
    println(myArr.contentToString())
    println(myArr[0][0])
}

