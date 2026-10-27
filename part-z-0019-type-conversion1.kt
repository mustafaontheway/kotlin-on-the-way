fun main() {
    
	var age = "17 years old"
    
    try {
        
        val ageNum = age.toInt()
    }
    
    catch(nfe: NumberFormatException) {
        
        //println("Error: $nfe") // Error: java.lang.NumberFormatException: For input string: "17 years old"
        
        println("Not a number...") // Not a number...
    }
}

