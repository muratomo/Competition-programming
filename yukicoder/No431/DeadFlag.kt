package No431

fun main(args: Array<String>) {
    val flags : List<Int> = readLine()!!.split(" ").map { it.toInt() }
    if (isDead(flags)) {
        println("DEAD")
    } else {
        println("SURVIVED")
    }
}

fun isDead(flags : List<Int>) : Boolean {
    if (flags.last() == 1) {
        return false
    } else {
        return flags.sum() >= 2
    }
}