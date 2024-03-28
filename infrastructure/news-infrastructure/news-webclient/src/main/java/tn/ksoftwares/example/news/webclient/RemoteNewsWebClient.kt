package tn.ksoftwares.example.news.webclient

import javax.inject.Inject
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import tn.ksoftwares.example.news.datasource.remote.RemoteNewsDataSource
import tn.ksoftwares.example.news.webclient.networking.NewsApi
import tn.ksoftwares.example.utils.ResourceState
import tn.ksoftwares.example.utils.ResourceStateError

class RemoteNewsWebClient @Inject constructor(
    private val newsApi: NewsApi
) : RemoteNewsDataSource {
    override fun getNewsHeadline(country: String) = flow {
        emit(newsApi.getNewsHeadline(country))
    }.map {
        if (it.isSuccessful && it.body() != null) {
            ResourceState.Success(it.body()!!)
        } else {
            ResourceState.Error(ResourceStateError("Error fetching news data"))
        }
    }.catch {
        emit(ResourceState.Error(ResourceStateError(it.localizedMessage ?: "Some error in the flow")))
    }
}