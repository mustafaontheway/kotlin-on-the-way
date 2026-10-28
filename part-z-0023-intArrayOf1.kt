fun main() {
    
	// fixed length, but mutable
    
    val ages = intArrayOf(20, 32, 8, 45, 77)
    
    ages[2] = 99 
    
    ages.set(2, 49) 
    
    for (age in ages) {
        
        println(age)
    }
}

// 20
// 32
// 49
// 45
// 77

