package tn.ksoftwares.example.news.webclient.networking

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import tn.ksoftwares.example.model.NewsResponse

interface NewsApi {

    @GET("/v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "c5ec21a6e825449b835d7d0bac5ced44"
    ): Response<NewsResponse>

}