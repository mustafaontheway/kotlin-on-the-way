fun main() {
    
	var age = "17"
    
	var ageNumeric = age.toIntOrNull()
    
    if (ageNumeric != null) {
        
        ageNumeric++
        
    } else {
        
        println("Something is wrong")
    }
    
    println(ageNumeric) // 18
}

