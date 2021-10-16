package com.example.abndp4bynooralmashhadani;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class D2AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Moonlight", "D-2", "Agust D", "2020", R.drawable.d2_album_cover));
        songs.add(new Song("Daechwita", "D-2", "Agust D", "2020", R.drawable.d2_album_cover));
        songs.add(new Song("What do you think?", "D-2", "Agust D", "2020", R.drawable.d2_album_cover));
        songs.add(new Song("Strange", "D-2", "Agust D, RM", "2020", R.drawable.d2_album_cover));
        songs.add(new Song("28", "D-2", "Agust D, NiiHWA", "2020", R.drawable.d2_album_cover));
        songs.add(new Song("Burn It", "D-2", "Agust D, MAX", "2020", R.drawable.d2_album_cover));
        songs.add(new Song("People", "D-2", "Agust D", "2020", R.drawable.d2_album_cover));
        songs.add(new Song("Honsool", "D-2", "Agust D", "2020", R.drawable.d2_album_cover));
        songs.add(new Song("Interlude:Set me free", "D-2", "Agust D", "2020", R.drawable.d2_album_cover));
        songs.add(new Song("Dear my friend (feat. Kim Jong Wan of NELL)", "D-2", "Agust D, Kim Jong Wan", "2020", R.drawable.d2_album_cover));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            NowPlayingActivity.song = songs.get(position);

            Intent intent = new Intent(D2AlbumActivity.this, NowPlayingActivity.class);
            startActivity(intent);
        });
    }
}