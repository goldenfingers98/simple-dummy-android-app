package tn.ksoftwares.example.newsfeed.data.datasource

import retrofit2.Response
import tn.ksoftwares.example.newsfeed.data.entity.NewsResponse

interface NewsDataSource {
    suspend fun getNewsHeadline(country: String): Response<NewsResponse>
}