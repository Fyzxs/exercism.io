object Isogram {
    fun  isIsogram(input: String): Boolean {
        val charCount = mutableListOf<Char>()
        input.toLowerCase().forEach {
            if (charCount.contains(it)) {
                return false
            } else if(it.isLetter()) {
                charCount.add(it)
            }
        }
        return true
    }
}