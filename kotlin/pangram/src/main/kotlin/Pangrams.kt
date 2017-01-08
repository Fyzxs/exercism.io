object Pangrams {
    fun  isPangram(phrase: String): Boolean {
        val set = mutableSetOf<Char>()
        phrase.replace(Regex("[^A-Za-z]"), "")
                .forEach { set.add(it.toLowerCase()) }
        return set.size == 26
    }
}