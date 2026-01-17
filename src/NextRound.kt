fun main(){
    val (participants, place) = readln().split(" ").map{it.toInt()}
    var passed = 0
    val scores = readln().split(" ").map { it.toInt() }
    val minimumScore = scores[place-1]
    passed = scores.count {scores->
        scores>=minimumScore && scores>0
    }
    println(passed)

}