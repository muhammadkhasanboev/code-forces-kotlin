fun main(){
    val weights = readln().split(" ").map{it.toInt()}
    var a = weights[0]
    var b = weights[1]
    var years = 0

        while(a<=b){
            a = a*3
            b = b*2
            years += 1
        }
        println(years)
}