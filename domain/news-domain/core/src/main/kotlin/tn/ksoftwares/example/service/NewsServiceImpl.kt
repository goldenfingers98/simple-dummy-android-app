package tn.ksoftwares.example.service

import kotlinx.coroutines.flow.Flow
import tn.ksoftwares.example.model.NewsResponse
import tn.ksoftwares.example.ports.api.NewsService
import tn.ksoftwares.example.ports.spi.NewsRepository
import tn.ksoftwares.example.utils.ResourceState

class NewsServiceImpl(
    private val newsRepository: NewsRepository
): NewsService {

    override fun getNewsHeadline(country: String): Flow<ResourceState<NewsResponse>> {
        return newsRepository.getNewsHeadline(country)
    }

}