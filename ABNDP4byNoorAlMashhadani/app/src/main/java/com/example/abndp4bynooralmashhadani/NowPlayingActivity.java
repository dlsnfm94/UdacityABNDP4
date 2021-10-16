package com.example.abndp4bynooralmashhadani;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.abndp4bynooralmashhadani.databinding.ActivityNowPlayingBinding;

public class NowPlayingActivity extends AppCompatActivity {

    static Song song;
    ActivityNowPlayingBinding activityNowPlayingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityNowPlayingBinding = ActivityNowPlayingBinding.inflate(getLayoutInflater());
        View view = activityNowPlayingBinding.getRoot();
        setContentView(view);

        activityNowPlayingBinding.songImage.setImageResource(song.getImageResourceID());
        activityNowPlayingBinding.songName.setText(song.getSongName());
        activityNowPlayingBinding.albumName.setText(song.getAlbumName());
        activityNowPlayingBinding.artistName.setText(song.getArtistName());
        activityNowPlayingBinding.releaseDate.setText(song.getReleaseDate());
    }
}