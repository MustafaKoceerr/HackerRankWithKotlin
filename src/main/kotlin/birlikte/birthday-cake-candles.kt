package org.example

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
//    val max = candles.max()
//    val count = candles.count{
//        it == max
//    }
//    return count

    var max2 = candles[0]
    var countOfMax = 1
    for (candle in candles){
        if (candle > max2){
            countOfMax = 1
            max2 = candle
        }else if (candle == max2){
            countOfMax++
        }
    }
    return countOfMax
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
