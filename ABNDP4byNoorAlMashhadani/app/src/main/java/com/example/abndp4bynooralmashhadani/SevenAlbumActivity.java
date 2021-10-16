package com.example.abndp4bynooralmashhadani;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SevenAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Intro:Persona", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Boy With Luv (Feat. Halsey)", "MAP OF THE SOUL:7", "BTS, Halsey", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Make It Right", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Jamais Vu", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Dionysus", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Interlude:Shadow", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Black Swan", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Filter", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("My Time", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Louder than bombs", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("ON", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("UGH!", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("00:00 (Zero O'Clock)", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Inner Child", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Friends", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Moon", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Respect", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("We are Bulletproof:the Eternal", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("Outro:Ego", "MAP OF THE SOUL:7", "BTS", "2020", R.drawable.seven_album_cover));
        songs.add(new Song("ON (Feat. Sia)", "MAP OF THE SOUL:7", "BTS, Sia", "2020", R.drawable.seven_album_cover));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            NowPlayingActivity.song = songs.get(position);

            Intent intent = new Intent(SevenAlbumActivity.this, NowPlayingActivity.class);
            startActivity(intent);
        });
    }
}