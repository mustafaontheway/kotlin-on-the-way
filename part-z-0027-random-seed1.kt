import kotlin.random.Random

fun main() {
    
    val mySeed = Random(2026)
    
	val randomInt = mySeed.nextInt(-20, 10)
    
    println(randomInt)
    
    val randomRate = mySeed.nextDouble(1.0, 2.0)
    
    println(randomRate)
}

// always same numbers

// -3
// 1.5148087176543852

