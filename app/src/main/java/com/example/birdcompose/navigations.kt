package com.example.birdcompose

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen1"){
        composable(route = "screen1"){
            photoScreen("flamingo",
                imageId = R.drawable.flamingo,
                screenNumber = 1,
                navController = navController)
        }
        composable(route = "screen2"){
            photoScreen("unknown",
                imageId = R.drawable.unknown,
                screenNumber = 2,
                navController = navController)
        }
        composable(route = "screen3"){
            photoScreen("owl",
                imageId = R.drawable.owl,
                screenNumber = 3,
                navController = navController)
        }
        composable(route = "screen4"){
            photoScreen("pink",
                imageId = R.drawable.pink,
                screenNumber = 4,
                navController = navController)
        }
    }
}