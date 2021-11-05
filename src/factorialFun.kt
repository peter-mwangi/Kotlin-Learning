//Getting the actorial of a number say 5
fun main(){

    val num = 5
    var res: Long
    res = factorialCount(num)
    println("The factorial of $num = $res")
}
fun factorialCount(n: Int): Long{
//    5 = 5 * 4 *  3 * 2 * 1
    return if (n == 1){
        n.toLong()
    }
    else
    {
        n*factorialCount(n - 1)
    }

}