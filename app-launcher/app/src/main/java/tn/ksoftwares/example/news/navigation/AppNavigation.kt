package tn.ksoftwares.example.news.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import tn.ksoftwares.example.news.presentation.screens.HomeScreen
import tn.ksoftwares.example.uikit.routes.Routes

@Composable
fun AppNavigationGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.HOME_SCREN) {
        composable(Routes.HOME_SCREN) {
            HomeScreen()
        }
    }
}