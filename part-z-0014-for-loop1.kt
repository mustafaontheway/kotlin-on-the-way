fun main() {
    
	val nums = listOf(47, 48, 20, 25, 23, 34)
    
    val evenNums = mutableListOf<Int>()
    
    for (num in nums) {
        
        if (num % 2 == 0) {
            
            evenNums.add(num)
        }
    }
    
    println(evenNums)
}


// [48, 20, 34]
