package com.example.cookingveda.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cookingveda.pageui.discover.DiscoverScreen
import com.example.cookingveda.pageui.favorites.FavoriteScreen
import com.example.cookingveda.pageui.home.HomeScreen
import com.example.cookingveda.pageui.profile.ProfileScreen

@Composable
fun MainNavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) { HomeScreen(navController) }
        composable(BottomNavItem.Discover.route) { DiscoverScreen(navController) }
        composable(BottomNavItem.Favorite.route) { FavoriteScreen(navController) }
        composable(BottomNavItem.Profile.route) { ProfileScreen(navController) }
    }
}


