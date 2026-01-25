import kotlin.math.sign

fun main(){
    var firstString = readln()
    var secondString = readln()

    firstString=firstString.lowercase()
    secondString=secondString.lowercase()

    println(firstString.compareTo(secondString).sign)
}
