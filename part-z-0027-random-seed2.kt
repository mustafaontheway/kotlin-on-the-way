import kotlin.random.Random

fun main() {
    
    val candidates = listOf("Mustafa", "Ayhan", "Ayben", "Bilge", "Kutluk", "Bumin")
    
    val mySeed = Random(2026)
    
	val randomIndex = mySeed.nextInt(0, candidates.size)
    
    println("Winner: ${candidates[randomIndex]}")
}


// Winner: Bumin
