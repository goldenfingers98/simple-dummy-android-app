package tn.ksoftwares.example.news.repository

import kotlinx.coroutines.flow.Flow
import tn.ksoftwares.example.model.NewsResponse
import tn.ksoftwares.example.news.datasource.remote.RemoteNewsDataSource
import tn.ksoftwares.example.ports.spi.NewsRepository
import tn.ksoftwares.example.utils.ResourceState

class NewsRepositoryImpl(
    private val remoteNewsDataSource: RemoteNewsDataSource
): NewsRepository {

    override fun getNewsHeadline(country: String): Flow<ResourceState<NewsResponse>> {
        return remoteNewsDataSource.getNewsHeadline(country)
    }

}