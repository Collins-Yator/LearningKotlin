fun getUserEmail(): String?=
        listOf("yatorcollins44@gmail.com", null, "bruno@gmail.com").random()

fun main(){
    val email=getUserEmail()

    // Task: Print the email domain safely (everything after @)
    // Examples:
    // "collins@example.com" → "example.com"
    // null                   → "Unknown"

    // Use safe calls + Elvis
    // Bonus: also print length of domain if exists
}