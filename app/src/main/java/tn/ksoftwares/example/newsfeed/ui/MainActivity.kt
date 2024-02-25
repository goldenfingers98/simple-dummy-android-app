package tn.ksoftwares.example.newsfeed.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import dagger.hilt.android.AndroidEntryPoint
import tn.ksoftwares.example.newsfeed.ui.navigation.AppNavigationGraph
import tn.ksoftwares.example.newsfeed.ui.theme.NewsFeedTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsFeedTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                        .background(Color.White)
                ) {
                    ApplicationEntryPoint()
                }
            }
        }
    }
}

@Composable
fun ApplicationEntryPoint() {
    AppNavigationGraph()
}