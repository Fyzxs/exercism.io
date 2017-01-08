object WordCount {
    fun  phrase(phrase: String): Map<String, Int> {
        val wordCount = mutableMapOf<String, Int>()
        phrase.split(" ").forEach {
            val word = filterWord(it)
            if(wordCount.contains(word)){
                wordCount[word] = wordCount[word]!! + 1
            } else if(word.isNotBlank()){
                wordCount.put(word, 1)
            }
        }
        return wordCount
    }

    private fun filterWord(it: String) = it.
            toLowerCase().
            replace(Regex("[^A-Za-z0-9']"), "")
}