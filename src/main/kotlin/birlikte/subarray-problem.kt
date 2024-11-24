package birlikte

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'birlikte.birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    // m = 2 için, 1,2,1,3,2 size = 5, toplam 4 tane küme oluştu
    // m = 3 için , 1,2,3,4,5,6,7,8,9  toplam 9 elemanlı, 7 tane küme oluştu toplamda size +1 -m kadar küme oluşuyor
    // 0,1 | 1,2 | 2,3 | 3,4
    var count = 0
    for (i in 0..s.size-m){ // 0'dam s.size -m dahil olduğu için, istediğimiz küme sayısına ulaşırız.
        val result = (i..i+m-1).sumOf {
            s[it]
        }
        if (result == d) count++
    }

    return count

    var count2 = 0
    for (start in 0..s.size-m){
        if (s.copyOfRange(start, start+m).sum() == d) count2++

    }

    return count2


    (0..s.size-m).count{ start->
        s.copyOfRange(start, start+m).sum() == d
    }

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
