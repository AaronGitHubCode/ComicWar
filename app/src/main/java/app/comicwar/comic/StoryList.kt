package app.comicwar.comic

data class StoryList(
    val available: Int,
    val returned: Int,
    val collectionURI: String,
    val items: ArrayList<StorySummary>
)