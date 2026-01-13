fun main() {
    val fruits = listOf("🍎 Apple", "🍌 Banana", "🍊 Orange", "🥭 Mango")

    // Long version
    fruits.forEach { fruit ->
        println("I love $fruit")
    }

    // Short version (uses implicit 'it')
    fruits.forEach {
        println("Yum! → $it")
    }

    // With index (very useful!)
    fruits.forEachIndexed { index, fruit ->
        println("$index → $fruit")
    }
}