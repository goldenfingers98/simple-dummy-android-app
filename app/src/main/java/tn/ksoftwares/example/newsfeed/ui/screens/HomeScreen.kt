package tn.ksoftwares.example.newsfeed.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import tn.ksoftwares.example.newsfeed.data.entity.NewsResponse
import tn.ksoftwares.example.newsfeed.ui.components.Loader
import tn.ksoftwares.example.newsfeed.ui.components.NewsRowComponent
import tn.ksoftwares.example.newsfeed.ui.viewmodel.NewsViewModel
import tn.ksoftwares.example.newsfeed.utils.ResourceState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {
    val newsResponse by newsViewModel.news.collectAsState()
    when (newsResponse) {
        is ResourceState.Loading -> {
            Loader()
            Log.d("HomeScreen", "Loading data.")
        }
        is ResourceState.Success -> {
            Log.d("HomeScreen", "Got response.")
            val response = (newsResponse as ResourceState.Success<NewsResponse>).data
            if (response.articles.isNotEmpty()) {
                val pagerState = rememberPagerState(
                    initialPage = 0,
                    initialPageOffsetFraction = 0f
                ) { response.articles.size }
                VerticalPager(
                    state = pagerState,
                    modifier = Modifier.fillMaxSize(),
                    pageSize = PageSize.Fill,
                    pageSpacing = 8.dp
                ) { page ->
                    NewsRowComponent(response.articles[page])
                }
            }
        }
        is ResourceState.Error -> {

        }
    }

}

@Preview
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}