package com.example.abndp4bynooralmashhadani;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BeAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Life Goes On", "BE", "BTS", "2020", R.drawable.be_album_cover));
        songs.add(new Song("Fly To My Room", "BE", "BTS", "2020", R.drawable.be_album_cover));
        songs.add(new Song("Blue & Grey", "BE", "BTS", "2020", R.drawable.be_album_cover));
        songs.add(new Song("Skit", "BE", "BTS", "2020", R.drawable.be_album_cover));
        songs.add(new Song("Telepathy", "BE", "BTS", "2020", R.drawable.be_album_cover));
        songs.add(new Song("Dis-ease", "BE", "BTS", "2020", R.drawable.be_album_cover));
        songs.add(new Song("Stay", "BE", "BTS", "2020", R.drawable.be_album_cover));
        songs.add(new Song("Dynamite", "BE", "BTS", "2020", R.drawable.be_album_cover));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            NowPlayingActivity.song = songs.get(position);

            Intent intent = new Intent(BeAlbumActivity.this, NowPlayingActivity.class);
            startActivity(intent);

        });
    }
}