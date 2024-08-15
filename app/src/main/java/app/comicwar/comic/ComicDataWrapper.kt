package app.comicwar.comic

data class ComicDataWrapper(
    val code: Int,
    val status: String,
    val copyright: String,
    val attributionText: String,
    val attributionHTML: String,
    val data: ComicDataContainer,
    val etag: String
)
