package tn.ksoftwares.example.newsfeed.data.datasource

import javax.inject.Inject
import retrofit2.Response
import tn.ksoftwares.example.newsfeed.data.api.ApiService
import tn.ksoftwares.example.newsfeed.data.entity.NewsResponse

class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService
): NewsDataSource  {
    override suspend fun getNewsHeadline(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadline(country)
    }
}