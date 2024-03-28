package tn.ksoftwares.example.news.datasource.remote

import kotlinx.coroutines.flow.Flow
import tn.ksoftwares.example.model.NewsResponse
import tn.ksoftwares.example.utils.ResourceState

interface RemoteNewsDataSource {

    fun getNewsHeadline(country: String): Flow<ResourceState<NewsResponse>>

}