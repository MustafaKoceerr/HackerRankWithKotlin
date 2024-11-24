package birlikte

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'birlikte.breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var min = scores[0]
    var max = scores[0]
    var localMinCount = 0
    var localMaxCount = 0

    for (score in scores) {
        if (score < min) {
            min = score
            localMinCount++
        }
        if (score > max) {
            max = score
            localMaxCount++
        }
    }

    return arrayOf(localMaxCount, localMinCount)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
