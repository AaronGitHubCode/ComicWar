package app.comicwar.comic

data class CharacterList(
    val available: Int,
    val returned: Int,
    val collectionURI: String,
    val items: ArrayList<CharacterSummary>
)
