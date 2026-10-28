fun main() {
    
    val names = mutableListOf("Aybüke", "Ayhan", "Aygün")
    
    names.add("Aykan")
    
    names[0] = "Aybüke Gül"
   
  	for (name in names) {
        
        println(name)
    }
}

// Aybüke Gül
// Ayhan
// Aygün
// Aykan

