fun main(){
    var input:String?

    do{
        println("Enter a positive number: ")
        input=readln()
    }while(input?.toIntOrNull()==null || input.toInt()<=0)

    println("Thanks! You entered : ${input?.toInt()}")
}