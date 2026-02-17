fun main(){
    val nickname = readln()
    val alphabet = nickname.toCharArray().sorted().joinToString("")
    var count = 0

    for(i in 0..alphabet.length-2){
        if(alphabet[i]==alphabet[i+1]){
            count ++
        }
    }
    if((alphabet.length-count) % 2 == 0){
        println("CHAT WITH HER!")
    }else{
        println("IGNORE HIM!")
    }
}