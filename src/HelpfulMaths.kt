fun main(){
    val problem = readln().toCharArray().sorted().filter { it != '+' }
    var answer = ""
    if(problem.size == 1){
        println(problem[0])
    }else{
        for(i in 0 .. problem.size-1){
             answer += problem[i]+"+"
        }
        answer = answer.dropLast(1)
        println(answer)
    }
}