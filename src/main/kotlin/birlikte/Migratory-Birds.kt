package birlikte

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'birlikte.migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here
    val myMap: MutableMap<Int, Int> = mutableMapOf<Int, Int>()

    arr.forEach {
        myMap[it] = myMap.getOrDefault(it, 0) + 1
    }

    var maxValue = -1
    var maxKey = -1
    myMap.forEach { (key, value) ->
        if (value > maxValue || (value == maxValue && key < maxKey)) {
            maxValue = value
            maxKey = key
        }
    }
    return maxKey

    val counts = arrayOf(0, 0, 0, 0, 0, 0)
    arr.forEach {
        counts[it]++
    }

    var max = 0
    var maxIndex = 0
    for ((index, count) in counts.withIndex()){
        if (max < count){
            max = count
            maxIndex = index
        }
    }
    return maxIndex
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
