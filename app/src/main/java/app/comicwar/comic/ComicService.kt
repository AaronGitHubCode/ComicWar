package app.comicwar.comic

import app.comicwar.utils.PUBLIC_API_KEY

import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Field
import retrofit2.http.Query

interface ComicService {
    @GET("comics?apikey=$PUBLIC_API_KEY&ts=1&hash=bf3d1dde66eb223f37a0cdcffcedba7f")
    fun listAllComicsWithLimit(@Query("limit") limit: Int): Call<ComicDataContainer>
    @GET("comics/{comicId}/?apikey=$PUBLIC_API_KEY&ts=1&hash=bf3d1dde66eb223f37a0cdcffcedba7f")
    fun getRandomComic(@Field("comicId") id: Int = Math.round(Math.random() * 100).toInt())
}