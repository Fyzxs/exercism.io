object Hamming {
    fun  compute(left: String, right: String): Int {
        if(left.length != right.length) throw IllegalArgumentException()
        var ctr = 0
        left.forEachIndexed { i, c ->
            ctr += if(c == right[i]) 0 else 1
        }
        return ctr
    }
}