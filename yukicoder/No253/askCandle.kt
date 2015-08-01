//not implemented

var MAX = Math.pow(10.0,9.0).toInt() + 1
var count = 0

fun askCandle(left : Int, right : Int) {
    count++
    var x = (left + right) / 2

    println("? " + x.toInt())
    var ans = readLine()!!.toInt()

    if(ans == 1) {
        askCandle(x - 1, right)
    }
    else if(ans == -1){
        askCandle(left, x - 2)
    }
    else {
        var res = (x - 1) + count
        println("! " + res)
        return
    }
}

fun main(args : Array<String>) {
    askCandle(-1, MAX)
}
