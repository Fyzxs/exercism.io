object RnaTranscription {
    fun ofDna(dna: String): String {
        val tDna: CharArray = kotlin.CharArray(dna.length)
        dna.forEachIndexed { i, c ->
            tDna[i] = Transcriber.toRna(c)
        }
        return tDna.joinToString("")
    }
}

private object Transcriber{
    private const val cytosine = 'C'
    private const val guanine = 'G'
    private const val adenine = 'A'
    private const val uracil = 'U'
    private const val thymine = 'T'
    private val dnaToRna = mapOf(
            Pair(cytosine, guanine), Pair(guanine, cytosine),
            Pair(thymine, adenine), Pair(adenine, uracil))

    fun toRna(dna: Char): Char = dnaToRna[dna]!!
}