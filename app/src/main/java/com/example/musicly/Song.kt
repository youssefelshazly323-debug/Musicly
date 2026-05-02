package com.example.musicly

import android.util.Log

@Suppress("SameReturnValue")
class Song(
    songName: String,
    songArtist: String = "Unknown Artist",
    songYear: Int = 0,
    songDuration: String = ""
) {

    var name: String = songName
    var artist: String = songArtist
    var year: Int = songYear
    var duration: String = songDuration

    val DisplaySongs: String
        get() {
            val artistDisplay = if (artist == "Unknown Artist") "Unknown Artist" else artist
            val yearDisplay = if (year == 0) "Unknown Year" else year.toString()
            val durationDisplay = if (duration == "") "Unknown Duration" else duration
            return "$name\n Artist: $artistDisplay\n Year: $yearDisplay\n Duration: $durationDisplay\n"
        }

    fun play() { Log.v("song", "$name is playing") }
    fun pause() { Log.v("song", "$name is paused") }
    fun stop() { Log.v("song", "$name is stopped") }
    fun favorite(): Boolean {
        Log.v("song", "$name is liked")
        return true
    }
}