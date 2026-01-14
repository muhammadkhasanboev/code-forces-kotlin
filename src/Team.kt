fun main(){
    val problems = readln()
    val loop = problems.toInt()

    var solved = 0

    for(i in 0..loop-1){
        val answer = readln()
        val noWhiteSpace = answer.filterNot{it.isWhitespace()}
        if(noWhiteSpace.equals("110")||noWhiteSpace.equals("101")||noWhiteSpace.equals("011")||noWhiteSpace.equals("111")){
            solved++
        }
    }
    println(solved)
}