var MAX = Math.pow(10.0,9.0).toInt()
var count = 0
var ans = 0

fun QandA(left : Int, right : Int) {
    count++
    var x = (left + right) / 2

    if(count == 100) {
        System.out.println("! " + x.toInt())
        return
    }

    System.out.println("? " + x.toInt())
    ans = readLine()!!.toInt()

    if(ans == 1) {
        QandA(x, right)
    }
    else {
        QandA(left, x - 1)
    }
}

fun main(args : Array<String>) {
    QandA(0, MAX)
}
