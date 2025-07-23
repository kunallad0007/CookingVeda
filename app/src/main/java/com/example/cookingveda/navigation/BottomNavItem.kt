package com.example.cookingveda.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val route: String
) {
    object Home : BottomNavItem("Home", Icons.Default.Home, "home")
    object Discover : BottomNavItem("Discover", Icons.Default.Search, "discover")
    object Favorite : BottomNavItem("Favorites", Icons.Default.Favorite, "favorites")
    object Profile : BottomNavItem("Profile", Icons.Default.Person, "profile")
}
