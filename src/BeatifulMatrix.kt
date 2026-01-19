fun main() {
    var answer = 0

    repeat(5) { row ->
        val line = readln().split(" ")

        val col = line.indexOf("1")
        if (col >= 0) {
            answer = kotlin.math.abs(row - 2) + kotlin.math.abs(col - 2)
        }
    }

    println(answer)
}