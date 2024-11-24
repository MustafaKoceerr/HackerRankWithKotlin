package birlikte

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'birlikte.dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

//val months = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//val monthsLeap = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//val months1918 = arrayOf(31, 15, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

fun dayOfProgrammer(year: Int): String {
    // Write your code here
    val feb = when {
        year == 1918 -> 15
        year.isLeap() -> 29
        else -> 28
    }
    val months = arrayOf(0, 31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    var sum = 0
    months.forEachIndexed { index, month ->
        if (sum + month < 256){
            sum += month
        }else{
            // index istediğimiz ay
            val m = index.toString().padStart(2, '0')
            val d = (256 - sum).toString().padStart(2, '0')
            return "$d.$m,$year"
        }
    }

    return ""
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)

}

fun Int.isLeap() = when {
    this < 1918 -> this % 4 == 0
    else -> this % 400 == 0 || (this % 4 == 0 && this % 100 != 0)
}