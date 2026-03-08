fun printMessageWithPrefix(message: String, prefix:String="Info"){
    println("[$prefix ], $message")
}

fun main(){
    printMessageWithPrefix("Hello.", "log")

    printMessageWithPrefix("Hello.")

    printMessageWithPrefix(prefix="Log", message="Hello")
}