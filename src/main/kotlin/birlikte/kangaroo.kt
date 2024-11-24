package birlikte

/*
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */

/*
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // Write your code here
    // eğer yavaş olan arkadaysa direkt no dönmeliyiz, çünkü yetişme imkanı yok.
    if ((x1 < x2 && v1 < v2) || (x2 < x1 && v2 < v1)) {
        return "NO"
    }

    if (x1 > x2 && v2 > v1) {
        val hizFarki = v2 - v1
        val mesafeFarki = x1 - x2
        if (mesafeFarki % hizFarki == 0) {
            return "YES"
        } else {
            return "NO"
        }
    }

    if (x2 > x1 && v1 > v2) {
        val hizFarki = v1 - v2
        val mesafeFarki = x2 - x1
        if (mesafeFarki % hizFarki == 0) {
            return "YES"
        } else {
            return "NO"
        }
    }


    when {
        (x1 < x2 && v1 < v2) || (x2 < x1 && v2 < v1) -> "NO"
        x1 > x2 && v2 > v1 -> {
            val hizFarki = v2 - v1
            val mesafeFarki = x1 - x2
            if (mesafeFarki % hizFarki == 0) "YES"
            else "NO"
        }

        x2 > x1 && v1 > v2 -> {
            val hizFarki = v1 - v2
            val mesafeFarki = x2 - x1
            if (mesafeFarki % hizFarki == 0) "YES"
            else "NO"
        }
        else -> "NO"
    }
}
 */

