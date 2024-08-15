package app.comicwar.comic

import java.util.Date

data class Comic(
    val id: Int,
    val digitalId: Int,
    val title: String,
    val issueNumber: Double,
    val variantDescription: String,
    val description: String,
    val modified: Date,
    val isbn: String,
    val upc: String,
    val diamondCode: String,
    val ean: String,
    val issn: String,
    val format: String,
    val pageCount: Int,
    val textObjects: ArrayList<TextObject>,
    val resourceURI: String,
    val urls: ArrayList<Url>,
    val series: SeriesSummary,
    val variants: ArrayList<ComicSummary>,
    val collections: ArrayList<ComicSummary>,
    val collectedIssues: ArrayList<ComicSummary>,
    val dates: ArrayList<ComicDate>,
    val prices: ArrayList<ComicPrice>,
    val thumbnail: Image,
    val images: List<Image>,
    val creators: CreatorList,
    val characters: CharacterList,
    val stories: StoryList,
    val events: EventList
)
