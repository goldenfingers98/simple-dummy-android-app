package tn.ksoftwares.example.newsfeed.ui.repository

import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import tn.ksoftwares.example.newsfeed.data.datasource.NewsDataSource
import tn.ksoftwares.example.newsfeed.data.entity.NewsResponse
import tn.ksoftwares.example.newsfeed.utils.ResourceState

class NewsRepository @Inject constructor(
    private val newsDataSource: NewsDataSource
) {

    fun getNewsHeadline(country: String): Flow<ResourceState<NewsResponse>> {
        return flow {
            val response = newsDataSource.getNewsHeadline(country)
            if (response.isSuccessful && response.body() != null) {
                emit(ResourceState.Success(response.body()!!))
            } else {
                emit(ResourceState.Error("Error fetching news data"))
            }
        }.catch {
            emit(ResourceState.Error(it.localizedMessage ?: "Some error in the flow"))
        }
    }

}