package com.example.musicapp.ui

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.musicapp.Screen
import com.example.musicapp.screensInBottom

@Composable
fun BottomNav(
    currentScreen: Screen,
    currentRoute: String?,
    controller: NavController,
    title: MutableState<String>
) {
    if (currentScreen is Screen.DrawerScreen || currentScreen == Screen.BottomScreen.Home) {
        BottomNavigation(modifier = Modifier.wrapContentSize()) {
            screensInBottom.forEach { item ->
                BottomNavigationItem(
                    selected = currentRoute == item.bRoute,
                    onClick = {
                        controller.navigate(item.bRoute)
                        title.value = item.bTitle
                              },
                    icon = {
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = item.bTitle
                        )
                    },
                    label = { Text(text = item.bTitle) },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.Black
                )
            }
        }
    }
}