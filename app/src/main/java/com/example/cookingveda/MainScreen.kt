package com.example.cookingveda

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.cookingveda.navigation.MainNavigationGraph
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import android.os.Build
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.R)
@SuppressLint("WrongConstant")
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    // ✅ For status bar color change
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(Color.White)
    }

    Scaffold(
//        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = paddingValues.calculateBottomPadding())
        ) {
            MainNavigationGraph(navController = navController)
        }
    }
}

