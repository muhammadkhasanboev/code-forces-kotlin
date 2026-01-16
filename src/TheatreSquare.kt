fun main() {
    val (n, m, a) = readln().split(" ").map { it.toLong() }

    val stonesInLength = (n + a - 1) / a
    val stonesInWidth = (m + a - 1) / a

    println(stonesInLength * stonesInWidth)
}
