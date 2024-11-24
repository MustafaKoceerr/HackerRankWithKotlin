import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

fun pageCount(n: Int, p: Int): Int = when {
    (n % 2 == 0 && n == p) || p == 1 -> 0

    p % 2 == 0 && n - p <= p -> searchFromEnd(n, p)
    p % 2 == 1 && n - p >= p -> searchFromStart(p)

    n - p <= p -> searchFromEnd(n, p)
    n - p >= p -> searchFromStart( p)
    else -> 0
}

fun searchFromStart(p: Int): Int {
// 1- 2,3 - 4,5 - 6,7
    return p / 2
}

fun searchFromEnd(n: Int, p: Int): Int {
// 1- 2,3 - 4,5 - 6,7 - 8,9 - 10-11 , 12
    if (n % 2 == 0 && p % 2 == 1) return (n - p) / 2 + 1
    else return (n - p) / 2

//    if (n % 2 == 1) return (n - p) / 2
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
