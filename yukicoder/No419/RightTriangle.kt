package No419

fun main(args: Array<String>) {
    val a_b : List<Int> = readLine()!!.split(" ").map { it.toInt() }
    val result = "%.10f".format(getThirdSide(a_b))
    // val result = java.lang.String.format("%.10f", getThirdSide(a_b))
    println(result)
}

fun getThirdSide(ab : List<Int>) : Double {
    val a = ab.first().toDouble()
    val b = ab.last().toDouble()
    if (a == b) {
        val c2 = Math.pow(a, 2.0) + Math.pow(b, 2.0)
        return Math.sqrt(c2)
    } else if (a > b) {
        val c2 = Math.pow(a, 2.0) - Math.pow(b, 2.0)
        return Math.sqrt(c2)
    } else {
        val c2 = Math.pow(b, 2.0) - Math.pow(a, 2.0)
        return Math.sqrt(c2)
    }
}

