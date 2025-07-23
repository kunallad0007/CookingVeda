package com.example.cookingveda.navigation

import androidx.annotation.DrawableRes
import com.example.cookingveda.R

sealed class NavigationItem(val route: String, val label: String, @DrawableRes val icon: Int) {
    object Home : NavigationItem("home", "Home", R.drawable.ic_home)
    object Recipes : NavigationItem("discover", "Discover", R.drawable.ic_explore)
    object Favorites : NavigationItem("favorites", "Favorites", R.drawable.ic_favorite)
    object Profile : NavigationItem("profile", "Profile", R.drawable.ic_profile)
}
