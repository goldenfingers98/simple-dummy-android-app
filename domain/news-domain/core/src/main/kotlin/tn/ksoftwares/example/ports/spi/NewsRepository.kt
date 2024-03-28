package tn.ksoftwares.example.ports.spi

import tn.ksoftwares.example.model.NewsResponse
import tn.ksoftwares.example.utils.ResourceState
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getNewsHeadline(country: String): Flow<ResourceState<NewsResponse>>

}