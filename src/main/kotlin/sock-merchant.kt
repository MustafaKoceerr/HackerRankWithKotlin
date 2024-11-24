import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    val socksMap: MutableMap<Int, Int> = mutableMapOf()

    ar.forEach {
        if (it in socksMap.keys) {
            socksMap.get(it)?.let {value->
                socksMap.put(it, value+1)
            }
        }else{
            socksMap.put(it, 1)
        }
    }
    var odds = 0
    socksMap.values.map {
        odds+= it/2
    }

    return odds
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
