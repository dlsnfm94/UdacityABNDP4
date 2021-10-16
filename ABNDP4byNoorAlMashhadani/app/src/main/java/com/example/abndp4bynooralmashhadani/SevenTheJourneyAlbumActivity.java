package com.example.abndp4bynooralmashhadani;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SevenTheJourneyAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("INTRO:Calling", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("Stay Gold", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("Boy With Luv - Japanese ver.", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("Make It Right - Japanese ver.", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("Dionysus - Japanese ver.", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("IDOL - Japanese ver.", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("Airplane pt.2 - Japanese ver.", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("FAKE LOVE - Japanese ver.", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("Black Swan - Japanese ver.", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("ON - Japanese ver.", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("Lights", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("Your eyes tell", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));
        songs.add(new Song("OUTRO:The Journey", "MAP OF THE SOUL:7~THE JOURNEY~", "BTS", "2020", R.drawable.seven_the_journey_album_cover));


        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            NowPlayingActivity.song = songs.get(position);

            Intent intent = new Intent(SevenTheJourneyAlbumActivity.this, NowPlayingActivity.class);
            startActivity(intent);
        });
    }
}