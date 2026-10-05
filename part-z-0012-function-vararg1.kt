fun main() {
    
	val s1 = sumNums(12.34, 12.21)
    
    println(s1)
    
    val s2 = sumNums(3.22, 4.55, 17.2121)
    
    println(s2)
}

fun sumNums(vararg numbers: Double): Double {
    
    var s = 0.0
    
    for (num in numbers) {
        
        s += num
    }
    
    return s
}

// 24.55
// 24.9821
