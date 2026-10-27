fun main() {
    
	val month = 3
    
    val result = when (month) {
        
        12, 1, 2 -> "Winter"
        3, 4, 5 -> "Spring"
        6, 7, 8 -> "Summer"
        9, 10, 11 -> "Autumn"
        
        else -> "Not a month..."
    }
    
    println(result)
}

// Spring
