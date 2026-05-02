package com.example.musicly

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val songDisplayTxt = findViewById<TextView>(R.id.songDisplayId)
        var songDisplay = ""

        val song1 = Song(songName = "Ordinary", songDuration = "3:45")
        val song2 = Song(songName = "So Easy", songDuration = "3:45")
        val song3 = Song(songName = "Swim", songDuration = "3:45")
        val song4 = Song(songName = "Anxiety", songDuration = "3:45")
        val song5 = Song(songName = "Hope", songDuration = "3:45")

        val songs = arrayOf(song1, song2, song3, song4, song5)

        for (s in songs) {
            songDisplay += "${s.DisplaySongs}\n\n"
        }
        songDisplayTxt.text = songDisplay

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}