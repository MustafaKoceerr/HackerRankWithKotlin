package org.example

import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    // 11:00:02AM
    var hour = s.take(2).toInt()
    val amPm = s.takeLast(2)

    val middle = s.substring(2, 8)
    val middle2 = s.substring(2..7)

    // 12:00:00 AM ise  -> 00:00:00
    // 12:05:00 AM ise  -> 00:05:00
    // 1:00:00 AM ise  -> 01:00:00

    // 12:00:00 PM ise  -> 12:00:00
    // 1:00:00 PM ise  -> 13:00:00
    // 11:00:00 PM ise  -> 23:00:00

    /*
// do nothingleri siliyorum ve ifadeyi basitleştiriyorum
    if (hour == 12){
        if (amPm == "AM"){
        // hour = 0
            hour = 0
        }else{
        // do nothing
        }
    }else{
        if (amPm == "AM"){
        // do nothing
        }else{
        // hour += 12
        }
    }
 */

    if (hour == 12 && amPm == "AM"){
        hour = 0
    }

    if (hour < 12 && amPm == "PM"){
        hour +=12
    }

    val hourStr = hour.toString().padStart(2, '0')
    /*
    Doldurucu karakter: Eğer mevcut string, belirttiğiniz uzunluktan kısa ise başına bu karakteri ekler.
    Eğer string zaten belirtilen uzunlukta ya da daha uzun ise, herhangi bir değişiklik yapılmaz.
     */
    return "$hourStr$middle"
}

fun main(args: Array<String>) {
//    val s = readLine()!!

    val result = timeConversion2("00:00:00AM")

    println(result)
}

fun timeConversion2(s: String): String {

    var hour = s.take(2)
    val ek = s.takeLast(2)
    val orta = s.substring(2,8)
    println("hour $hour, ek:$ek, orta $orta")

    var hourStr = when {
        // Eğer saat 12 ve AM ise, 00 yap
        hour.toInt() == 12 && ek == "AM" -> "00"

        // Eğer saat 12 ve PM ise, olduğu gibi bırak
        hour.toInt() == 12 && ek == "PM" -> "12"

        // Eğer PM ve saat 12'den küçükse, 12 ekle
        hour.toInt() < 12 && ek == "PM" -> (hour.toInt() + 12).toString()

        // Diğer durumlarda olduğu gibi bırak (AM ve 12'den küçük saatler)
        else -> hour
    }

    hourStr = hourStr.padStart(2, '0')
    return "$hourStr$orta"
}