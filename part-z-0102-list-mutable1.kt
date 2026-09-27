fun main() {
    
    val familyMembers = mutableListOf("Ayhan", "Bilge", "Bengü", "Kültigin")
    
    println("${familyMembers[0]}")
    
    familyMembers[0] = "Aykan"
    
    println(familyMembers)
}

// Ayhan
// [Aykan, Bilge, Bengü, Kültigin]
