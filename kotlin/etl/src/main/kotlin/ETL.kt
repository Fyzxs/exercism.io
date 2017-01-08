object ETL {
    fun transform(old: Map<Int, List<String>>): Map<String, Int> {
        val pairs = mutableListOf<Pair<String, Int>>()
        old.forEach {
            val key = it.key
            it.value.forEach {
                pairs.add(Pair(it.toLowerCase(), key))
            }
        }
        return pairs.toMap()
    }
}