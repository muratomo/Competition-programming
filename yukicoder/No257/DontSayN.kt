var N : Int = 0
var K : Int = 0

fun DontSayN() {
    var array = Array<Int>((N - 1) / (K + 1) + 1, {i -> (N - 1) - i * (K + 1)})
    array.reverse().forEach {
        println(it)
        var ans = readLine()!!.toInt()
        if (ans >= N) return
    }
}

fun main(args : Array<String>) {
    var arg = readLine()!!.split(" ").map { it.toInt() }
    N = arg[0]
    K = arg[1]
    DontSayN()
}
