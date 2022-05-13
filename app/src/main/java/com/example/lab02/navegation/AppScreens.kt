package com.example.lab02.navegation

sealed class AppScreens(val route: String){
    object FirstScreen: AppScreens("firts_screen")
    object SecondScreen: AppScreens("second_screen")
}
