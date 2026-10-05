fun main() {
    
    val (sum, sumPlusPromotion) = sumNums(-500.13, 246.0)
    
    println(sum)
    
    println(sumPlusPromotion)
}

fun sumNums(a: Double, b: Double): Pair<Double, Double> {
    
    return Pair(a + b, a + b + 25.12)
}

// -254.13
// -229.01

