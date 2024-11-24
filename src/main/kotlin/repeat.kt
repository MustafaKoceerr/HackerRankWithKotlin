import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */
// 256 gün hesaplanacak, toplaya toplaya gideceksin, toplamı 256'yı aşarsa o ayda duracaksın.
//var year1918 = arrayOf(0, 31, 15, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//var yearAfter = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//var yearLeap = arrayOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
fun dayOfProgrammer(year: Int, day: Int = 256): String {
    // Write your code here
    val feb = isLeap(year)
    var yearAfter = arrayOf(0, 31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    return computeDays(day, yearAfter) + "$year"
}

private fun isLeap(year: Int): Int {
    if (year == 1918) return 15
    if (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) return 29
    if (year < 1918 && (year % 4 == 0)) return 29

    return 28
}

private fun computeDays(day: Int, calendar: Array<Int>): String {
    var sum = 0
    for ((index, value) in calendar.withIndex()) {
        if (sum + value > day) {
            var realday = day - sum
            return realday.toString().padStart(2, '0') + "." +
                    index.toString().padStart(2, '0') + "."
        }
        sum += value
    }
    throw IndexOutOfBoundsException("Gun sayisi 365'den fazla, 0'dan az olamaz.")
}

fun main(args: Array<String>) {
    val year = 2016

    val result = dayOfProgrammer(year)

    println(result)

    val x = (1..13).count {
        if (it % 7 == 0) {
            return@count true
        } else if (it % 9 == 0) {
            return@count true
        }
        false
    }

    println(x)
}
