//  Very similar to while, but runs at least once even if condition is false from the beginning.

fun main(){
    var money=0

    do{
        println("You have $$money. Want to work?(yes/no)")
        val answer=readLine()!!.lowercase()

        if(answer=="yes") money +=100
    }while(money<500)
    println("You reached $money! Enough for today")
}