package org.example
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aliceScore=0
    var bobScore=0
    var aliceScore2= (0..2).count{
        a[it] > b[it]
    }
    var bobScore2=(0..2).count{
        b[it] > a[it]
    }
    for(index in a.indices){
        if(a[index] > b[index]){
            aliceScore++
        }else if(b[index] > a[index]){
            bobScore++
        }
    }

    return arrayOf(aliceScore, bobScore)
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
