fun main(){
    val loop = readln()
    val loopNumber = loop.toInt()

    for(i in 0..loopNumber-1){
        val word = readln()
        if(word.length<=10){
            println(word)
        }else{
            val lengthOfWord = word.length
            println("${word[0]}${lengthOfWord-2}${word[lengthOfWord-1]}")
        }
    }
}