fun main() {
    
	val s1 = sumNums(b = 12.34, a = 12.21)
    
    println(s1)
    
    val s2 = sumNums(3.22, 4.55, 17.2121)
    
    println(s2)
}

fun sumNums(a: Double, b: Double, c: Double = 3.21): Double {
    
    return a + b + c
}

// 27.76
// 24.9821

