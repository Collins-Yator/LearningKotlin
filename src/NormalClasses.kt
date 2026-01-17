// Main.kt
package classesdemo

// 1. Basic class - very simple version
class Person1 {
    // Properties (fields + getters/setters automatically generated)
    var name: String = "Unknown"
    var age: Int = 0

    // Method (function inside class)
    fun introduce() {
        println("Hi, I'm $name and I'm $age years old.")
    }
}

// 2. Class with primary constructor (most common pattern)
class Person2(val name: String, var age: Int) {

    // Secondary constructor (optional)
    constructor(name: String) : this(name, 0) {
        println("Created person with only name - age set to 0")
    }

    fun introduce() {
        println("Hello! My name is $name, age: $age")
    }

    fun haveBirthday() {
        age++
        println("$name is now $age years old! 🎉")
    }
}

// 3. Data class - automatically gets toString(), equals(), hashCode(), copy(), componentN()
data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    var inStock: Boolean = true
)

// 4. Class with inheritance
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name makes some generic animal sound...")
    }
}

class Dog(name: String, val breed: String) : Animal(name) {
    override fun makeSound() {
        println("$name ($breed) says: Woof woof! 🐶")
    }

    fun wagTail() {
        println("$name is happily wagging tail!")
    }
}

// 5. Class with companion object (like static members in Java)
class Counter {
    private var count = 0

    fun increment() {
        count++
    }

    fun getCount() = count

    // Companion object - shared across all instances (like static)
    companion object {
        const val MAX_COUNT = 1000
        fun createDefault(): Counter {
            return Counter().also { println("Default counter created") }
        }
    }
}

fun main() {
    println("=== 1. Basic class demo ===")
    val p1 = Person1()
    p1.name = "Alice"
    p1.age = 28
    p1.introduce()

    println("\n=== 2. Primary + secondary constructor ===")
    val p2a = Person2("Bob", 34)
    val p2b = Person2("Charlie")           // uses secondary constructor
    p2a.introduce()
    p2a.haveBirthday()
    p2a.introduce()

    println("\n=== 3. Data class magic ===")
    val phone1 = Product(101, "iPhone 15", 1299.99)
    val phone2 = phone1.copy(price = 1199.99)     // easy copy with modification

    println(phone1)                               // auto toString()
    println(phone2)
    println("Same product? ${phone1 == phone2}")  // structural equality

    // Destructuring declaration (component1, component2, ...)
    val (id, name, price) = phone1
    println("Destructured → ID: $id, $name @ \$$price")

    println("\n=== 4. Inheritance & polymorphism ===")
    val animal: Animal = Dog("Max", "Golden Retriever")
    animal.makeSound()                           // overridden method

    if (animal is Dog) {
        animal.wagTail()                         // smart cast!
    }

    println("\n=== 5. Companion object (static-like) ===")
    val c1 = Counter()
    val c2 = Counter()

    c1.increment()
    c1.increment()
    c2.increment()

    println("c1 count: ${c1.getCount()}")        // 2
    println("c2 count: ${c2.getCount()}")        // 1

    println("Max allowed count: ${Counter.MAX_COUNT}")
    val defaultCounter = Counter.createDefault()
}