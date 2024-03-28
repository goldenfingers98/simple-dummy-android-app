package tn.ksoftwares.example.news.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import tn.ksoftwares.example.model.NewsResponse
import tn.ksoftwares.example.ports.api.NewsService
import tn.ksoftwares.example.utils.ResourceState

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsService: NewsService
) : ViewModel() {

    private val _news: MutableStateFlow<ResourceState<NewsResponse>> = MutableStateFlow(ResourceState.Loading())
    val news: StateFlow<ResourceState<NewsResponse>> = _news

    init {
        getNewsHeadlines()
    }

    private fun getNewsHeadlines(country: String = "us") {
        viewModelScope.launch(Dispatchers.IO) {
            newsService.getNewsHeadline(country)
                .collectLatest {
                    _news.value = it
                }
        }
    }
}