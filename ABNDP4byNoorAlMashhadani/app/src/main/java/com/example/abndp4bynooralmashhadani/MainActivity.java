package com.example.abndp4bynooralmashhadani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.abndp4bynooralmashhadani.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        activityMainBinding.beAlbum.setOnClickListener(view1 -> {
            Intent intent = new Intent(MainActivity.this, BeAlbumActivity.class);
            startActivity(intent);
        });

        activityMainBinding.sevenTheJourneyAlbum.setOnClickListener(view12 -> {
            Intent intent = new Intent(MainActivity.this, SevenTheJourneyAlbumActivity.class);
            startActivity(intent);
        });

        activityMainBinding.sevenAlbum.setOnClickListener(view13 -> {
            Intent intent = new Intent(MainActivity.this, SevenAlbumActivity.class);
            startActivity(intent);
        });

        activityMainBinding.d2Album.setOnClickListener(view14 -> {
            Intent intent = new Intent(MainActivity.this, D2AlbumActivity.class);
            startActivity(intent);
        });
    }
}


