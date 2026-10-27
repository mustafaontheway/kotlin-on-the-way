fun main() {
    
	val month = 3
    
    when (month) {
        
        12, 1, 2 -> println("Winter")
        3, 4, 5 -> println("Spring")
        6, 7, 8 -> println("Summer")
        9, 10, 11 -> println("Autumn")
        
        else -> println("Not a month...")
    }
}

// Spring
