class Anagram(private val value: String) {
    private var charList: Map<Char, Int>

    init {
        charList = charCount(value)
    }

    fun match(options: List<String>): List<String> {
        val matches = mutableListOf<String>()
        options.forEach {
            val optionList = charCount(it)
            if(isAnagram(optionList) && !isSameWord(it)) {
                matches.add(it)
            }
        }
        return matches
    }

    private fun isSameWord(it: String) = it.toLowerCase() == value.toLowerCase()

    private fun isAnagram(optionList: Map<Char, Int>) = charList == optionList

    private fun charCount(string: String): Map<Char, Int>{
        val charCount = mutableMapOf<Char, Int>()
        string.toLowerCase().forEach {
            if (charCount.contains(it)) {
                charCount[it] = charCount[it]!! + 1
            } else {
                charCount.put(it, 1)
            }
        }
        return charCount
    }

}