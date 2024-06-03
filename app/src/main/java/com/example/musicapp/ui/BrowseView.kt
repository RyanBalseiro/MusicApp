package com.example.musicapp.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.example.musicapp.R

@Composable
fun BrowseView() {
    val categories = listOf(
        "Hits", "Happy", "Workout", "Running", "TGIF", "Yoga",
        "Techno", "House", "Rock", "Metal", "Swing"
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // 2 items per row
        content = {
            items(categories) { item ->
                // Your item composable
                BrowserItem(cat = item, drawable = R.drawable.baseline_apps_24)
            }
        }
    )
}