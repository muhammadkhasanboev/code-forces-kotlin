/**we use variables to store data
 * there are 2 types of variables:
 * 1. val - read-only variable
 * 2. var - mutable variable
 *
 * */

val top_level = "top level declared variable"

fun main(){
    val price = 1000
    var quantity = 10

    println("the price of bread is $price")
    println("in store available $quantity breads")

    println(top_level)
}

/**
 * we can declare variables outside the main()
 * that variables called top level declared variable */
