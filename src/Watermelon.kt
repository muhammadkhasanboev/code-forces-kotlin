fun main(){
    val userInput = readln()
    val watermelonWeight = userInput.toInt()

    if(watermelonWeight % 2==0 && watermelonWeight > 2){
        println("YES")
    }else{
        println("NO")
    }
}