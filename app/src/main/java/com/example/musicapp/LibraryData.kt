package com.example.musicapp

import androidx.annotation.DrawableRes

data class LibraryData(
    @DrawableRes val icon: Int,
    val name: String
)

//library items = Playlist, Artists, Albums, Songs, Genres
val libaries = listOf<LibraryData>(
    LibraryData(R.drawable.baseline_queue_music_24, "Playlist"),
    LibraryData(R.drawable.baseline_person_2_24, "Artists"),
    LibraryData(R.drawable.baseline_sd_storage_24, "Albums"),
    LibraryData(R.drawable.ic_music_player, "Songs"),
    LibraryData(R.drawable.baseline_speaker_group_24, "Genres"),
)
