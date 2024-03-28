package tn.ksoftwares.example.news.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import tn.ksoftwares.example.model.Article
import tn.ksoftwares.example.uikit.components.HeadingTextComponent
import tn.ksoftwares.example.uikit.components.NormalTextComponent

@Composable
fun NewsRowComponent(article: Article) {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(8.dp)
    ) {
        AsyncImage(
            modifier = Modifier.fillMaxWidth()
                .height(240.dp),
            model = article.urlToImage,
            contentDescription = "",
            contentScale = ContentScale.Crop,
            placeholder = painterResource(id = R.drawable.ic_image_placeholder),
            error = painterResource(id = R.drawable.ic_image_placeholder)
        )
        HeadingTextComponent(article.title)
        NormalTextComponent(article.description ?: "")
    }
}