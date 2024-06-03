package com.example.musicapp.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.musicapp.MainViewModel
import com.example.musicapp.Screen

@Composable
fun Navigation(navController: NavController, viewModel: MainViewModel, pd: PaddingValues) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screen.BottomScreen.Home.route,
        modifier = Modifier.padding(pd)
    ){
        //drawer navs
        composable(Screen.DrawerScreen.Account.route){
            AccountView()
        }
        composable(Screen.DrawerScreen.Subscription.route){
            SubscriptionView()
        }
        //bottom navs
        composable(Screen.BottomScreen.Home.bRoute){
            HomeView()
        }
        composable(Screen.BottomScreen.Browse.bRoute){
            BrowseView()
        }
        composable(Screen.BottomScreen.Library.bRoute){
            LibraryView()
        }
    }
}