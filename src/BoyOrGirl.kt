fun main(){
    val nickname = readln().toCharArray().sorted().joinToString("")
    var count = 0

    for(i in 0..nickname.length-2){
        if(nickname[i]==nickname[i+1]){
            count ++
        }
    }
    if((nickname.length-count) % 2 == 0){
        println("CHAT WITH HER!")
    }else{
        println("IGNORE HIM!")
    }
}