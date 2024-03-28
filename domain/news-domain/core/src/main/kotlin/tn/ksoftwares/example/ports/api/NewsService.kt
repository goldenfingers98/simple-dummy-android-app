package tn.ksoftwares.example.ports.api

import kotlinx.coroutines.flow.Flow
import tn.ksoftwares.example.model.NewsResponse
import tn.ksoftwares.example.utils.ResourceState

interface NewsService {

    fun getNewsHeadline(country: String): Flow<ResourceState<NewsResponse>>

}