package com.example.musicapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.LibraryData
import com.example.musicapp.R
import com.example.musicapp.libaries

@Composable
fun LibraryView() {

    LazyColumn {
        items(libaries) { lib ->
            LibItem(lib = lib)
        }
    }
}

@Composable
fun LibItem(lib: LibraryData) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp, horizontal = 2.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(painter = painterResource(id = lib.icon), contentDescription = lib.name)
                Text(text = lib.name)
            }
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null
            )
        }
        Divider(thickness = 1.dp)
    }
}

@Preview(showBackground = true)
@Composable
fun LibItemPrev() {
    val lib = LibraryData(R.drawable.ic_music_player, "Test")
    Column {
        LibItem(lib = lib)
        LibItem(lib = lib)
    }
}