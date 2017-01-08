object Accumulate {
    fun <T, U> accumulate(input: List<T>, transform: (T) -> U): List<U> {
        val list = mutableListOf<U>()
        input.forEach { list.add(transform(it)) }
        return list
    }
}