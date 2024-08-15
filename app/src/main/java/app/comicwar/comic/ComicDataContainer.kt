package app.comicwar.comic

data class ComicDataContainer(
    val offset: Int,
    val limit: Int,
    val total: Int,
    val count: Int,
    val results: ArrayList<Comic>
)
