var count = 0
fun recursionFun()
{
    count++
    if(count <= 5)
    {
        println("Hello $count")
        recursionFun()
    }
}
fun main()
{
    recursionFun()
}