fun Buzz(n : Int) : Boolean = n % 5 == 0

fun FizzBuzz(N : Int){
    val Fizz : (Int) -> Boolean = {(n : Int) -> n % 3 == 0}
//    val Buzz : (Int) -> Boolean = {(n : Int) -> n % 5 == 0}
    for(i in 1..N) {
        println(
                when{
                    Fizz(i) && Buzz(i) -> "FizzBuzz"
                    Fizz(i) -> "Fizz"
                    Buzz(i) -> "Buzz"
                    else -> i
                }
        )
    }
}

fun main(args : Array<String>){
    FizzBuzz(readLine()!!.toInt())
}
