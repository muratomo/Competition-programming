package No94

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    if (N == 0) {
        println(1)
        return
    }

    val X = Array(N, {0})
    val Y = Array(N, {0})

    (0 until N).forEach {
        val xy = readLine()!!.split(" ").map { it.toInt() }
        X[it] = xy.first()
        Y[it] = xy.last()
    }

    val union = UnionFind(N)

    (0 until N).forEach { i ->
        (i+1 until N).forEach { j ->
            if (distNotSqrt(X[i] - X[j], Y[i] - Y[j]) <= 100) {
                union.union(i, j)
            }
        }
    }

    var mx = 0
    (0 until N).forEach { i ->
        (i+1 until N).forEach { j ->
            if (union.isSame(i, j)) {
                val len = distNotSqrt(X[i] - X[j], Y[i] - Y[j])
                if (mx < len) mx = len
            }
        }
    }
    println(Math.sqrt(mx.toDouble()) + 2)
}

fun distNotSqrt(a: Int, b: Int) = a * a + b * b

class UnionFind(N : Int) {
    val parent = Array(N, { i -> i })
    val rank = Array(N, { 0 })

    fun union(a : Int, b : Int) : Boolean {
        val Aroot = find(a)
        val Broot = find(b)
        if (Aroot == Broot) return false

        if (rank[Aroot] > rank[Broot]) {
            parent[Broot] = Aroot
        } else if (rank[Aroot] < rank[Broot]) {
            parent[Aroot] = Broot
        } else {
            parent[Aroot] = Broot
            rank[Broot]++
        }
        return true
    }

    fun find(a : Int) : Int {
        if (parent[a] == a) {
            return a
        } else {
            return find(parent[a])
        }
    }

    fun isSame(a : Int, b : Int) : Boolean = find(a) == find(b)
}