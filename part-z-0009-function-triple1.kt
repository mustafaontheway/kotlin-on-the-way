fun main() {
    
    val (sum, sumPlusPromotion1, sumPlusPromotion2) = sumNums(-500.13, 246.0)
    
    println(sum)
    
    println(sumPlusPromotion1)
    
    println(sumPlusPromotion2)
}

fun sumNums(a: Double, b: Double): Triple<Double, Double, Double> {
    
    return Triple(a + b, a + b + 25.12, a + b + 45.87)
}

// -254.13
// -229.01
// -208.26

