fun main(){
    val coordinate = readln().toInt()

    if(coordinate%5==0){
        println(coordinate/5)
    }else if(coordinate>5 && coordinate%5>=1){
        println(coordinate/5+1)
    }else{
        println(1)
    }
}