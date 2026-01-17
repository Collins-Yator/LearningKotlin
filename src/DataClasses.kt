data class User(val name: String,
                val age: Int,
                val email:String?=null)

fun main(){
    val user1=User("Collins", 25, "yatorcollins44@gmail.com")
    val user2=user1.copy(age=26)  // super useful

    println(user1)                  // User(name=Collins, age=25, email=collins@example.com)
    println(user1==user2)          // false (age different)
    println(user1.copy()==user1)  // true

    // Destructuring
    val (name,age)=user1
    println("$name is $age years old")
}