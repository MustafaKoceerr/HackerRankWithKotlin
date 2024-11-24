import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var totalScore = 0
    var changedScore = 0
    var inValley = false
    path.forEach {
        if (it.equals('U')) totalScore++
        if (it.equals('D')) totalScore--

        if (totalScore < 0 && inValley == false){
            inValley = true
            changedScore++
        }
        if (totalScore == 0){
            inValley = false
        }
    }
    return changedScore
}

fun main(args: Array<String>) {
    val steps = 8

    val path = "UDDDUDUU"

    val result = countingValleys(steps, path)

    println(result)
}
