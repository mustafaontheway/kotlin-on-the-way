fun main() {
    
	val members = listOf("Ayhan", "Aykan", "Aygün", "Ayben")
    
    for((i, name) in members.withIndex()) {
        
        println("Member${i + 1}: $name")
    }
}

// Member1: Ayhan
// Member2: Aykan
// Member3: Aygün
// Member4: Ayben
