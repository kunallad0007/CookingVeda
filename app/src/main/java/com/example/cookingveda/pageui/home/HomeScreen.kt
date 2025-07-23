package com.example.cookingveda.pageui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.cookingveda.navigation.BottomBar
import com.example.cookingveda.pageui.Header

@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = { Header() },
        bottomBar = { BottomBar(navController) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 24.dp,
                    bottom = innerPadding.calculateBottomPadding()
                )
                .fillMaxSize()
        ) {
            // Welcome Message
            Text(
                text = "Hi Kunal! 👋",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "What would you like to cook today?",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // Mic Button
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(100.dp)
                    .background(color = Color(0xFF7E57C2), shape = CircleShape)
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Mic,
                    contentDescription = "Mic",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Category Title
            Text(
                text = "Browse by Category",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Category Scroll Row
            val categories = listOf("Breakfast", "Lunch", "Dinner", "Snacks", "Desserts", "Drinks")

            Row(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
            ) {
                categories.forEach { category ->
                    CategoryCard(category)
                }
            }
        }
    }
}


@Composable
fun CategoryCard(category: String) {
    Card(
        backgroundColor = Color(0xFFF1F1F1),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .padding(end = 12.dp)
            .size(width = 100.dp, height = 60.dp)
            .clickable { /* TODO: navigate to category */ },
        elevation = 2.dp
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = category,
                fontWeight = FontWeight.Medium
            )
        }
    }
}
