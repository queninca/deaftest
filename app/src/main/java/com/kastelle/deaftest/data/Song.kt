package com.kastelle.deaftest.data

/** Class representing a song. */
data class Song (val title: String, val artist: String, val album: String, val lyrics: String) {
    override fun toString(): String {
        return "$title - $artist ($album)\n$lyrics"
    }
}