fun main() {
    
	val month = 12
    
    val result = when (month) {
        
        12, 1, 2 -> "Winter"
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9 until 12 -> "Autumn"
        
        else -> "Not a month..."
    }
    
    println(result)
}

// Winter
