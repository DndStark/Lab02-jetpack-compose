package com.example.lab02.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lab02.FirstScreen
import com.example.lab02.SecondScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route){
        composable(route = AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route + "/{ciudad}",
        arguments = listOf(navArgument(name = "ciudad"){
            type = NavType.StringType
        })){
            SecondScreen(navController, it.arguments?.getString("ciudad"))
        }
    }

}
