fun main() {
    
	var age = "17"
    
	var ageNumeric = age.toIntOrNull()
    
	ageNumeric?.let {
        
        ageNumeric += 3
    }
    
    println(ageNumeric) // 20
}

