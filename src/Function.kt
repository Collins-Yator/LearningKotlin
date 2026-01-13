fun main() {
    // 1. Simple function call
    sayHello("Collins")

    // 2. Function with return value
    val age = getUserAge()
    println("You entered age: $age")

    // 3. Function with default parameters
    greetWithMood("Collins", "pumped")     // uses default if you skip mood
    greetWithMood("Bro")                   // mood = "chill" by default

    // 4. Named arguments (super useful!)
    greetWithMood(mood = "legendary", name = "King Collins")

    // 5. Single-expression function (very common in Kotlin)
    val energyLevel = calculateEnergy(age)
    println("Your energy level: $energyLevel%")

    // Bonus: Function as value (intro to higher-order functions)
    val doubleIt = { x: Int -> x * 2 }
    println("Double 7 = ${doubleIt(7)}")
}

// 1. Basic function - Unit return type (like void)
fun sayHello(name: String) {
    println("Yo $name! Ready to level up in Kotlin? 🚀")
}

// 2. Function that returns Int + handles input
fun getUserAge(): Int {
    println("Enter your age bro:")
    val input = readln()

    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        println("That's not a number! Defaulting to 21 🔥")
        21
    }
}

// 3. Default parameters + named arguments
fun greetWithMood(name: String, mood: String = "chill") {
    println("Hey $name! Feeling $mood today? 😎")
}

// 4. Single-expression function (no curly braces needed)
fun calculateEnergy(age: Int): Int =
    when {
        age < 18 -> 150
        age in 18..25 -> 120
        else -> 90
    }