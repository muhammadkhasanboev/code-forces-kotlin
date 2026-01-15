fun main(){
    var result = 0
    val userInput = readLine()
    val loop = userInput?.toInt()

    for(i in 0..(loop?.minus(1) ?: 0)){
        val code = readln()
        if(code[1]=='+'){
            result++
        }else{
            result--
        }
    }
    println(result)
}