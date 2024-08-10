package app.comicwar.comic

import app.comicwar.utils.PUBLIC_API_KEY

import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Field
import retrofit2.http.Query

interface ComicService {
    @GET("comics?apikey=$PUBLIC_API_KEY")
    fun listAllComicsPerPage(@Query("page") page: Int): Call<List<Comic>>
    @GET("comics?apikey=$PUBLIC_API_KEY/{comicId}")
    fun getComicFromId(@Field("comicId") comicId: Int): Call<Comic>
}