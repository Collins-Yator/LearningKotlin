fun main(){
    println("Hello Collins Yator to Kotlin 2026.")

    val name="Collins"
    var mood="excited"

    mood="super pumped!"

    println("Yo $name feeling $mood today!")

    // Kotlin's famous if-expression
    val energy=if (mood.contains("pumped")) 100 else 30
    println("Energy level: $energy%")
}