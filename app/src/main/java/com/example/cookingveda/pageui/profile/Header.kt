package com.example.cookingveda.pageui

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.cookingveda.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header() {
    CenterAlignedTopAppBar(
        title = { Text("Cooking Veda") },
        navigationIcon = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(painter = painterResource(id = R.drawable.ic_menu), contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(painter = painterResource(id = R.drawable.ic_profile), contentDescription = "Profile")
            }
        }
    )
}

/*
Header()
Spacer(modifier = Modifier.height(16.dp))
*/