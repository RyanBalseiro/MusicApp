package com.example.musicapp.ui

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.example.musicapp.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun TopBar(
    scaffoldState: ScaffoldState,
    scope: CoroutineScope,
    title: MutableState<String>,
    modalSheetState: ModalBottomSheetState
) {
    TopAppBar(colors = TopAppBarDefaults.topAppBarColors(colorResource(id = R.color.purple_500)),
        title = { Text(text = title.value, color = Color.Black) },
        actions = {
            IconButton(
                onClick = {
                    //open the modal bottom sheet
                    scope.launch {
                        if (modalSheetState.isVisible){
                            modalSheetState.hide()
                        } else {
                            modalSheetState.show()
                        }
                    }
                },
            ) {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Menu",
                    tint = Color.Black)
            }
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    //open the drawer
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                },
            ) {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Menu",
                    tint = Color.Black)
            }
        }

    )
}

//colors = TopAppBarDefaults.topAppBarColors(colorResource(id = R.color.light_blue)),
//modifier = Modifier.background(MaterialTheme.colors.primarySurface),