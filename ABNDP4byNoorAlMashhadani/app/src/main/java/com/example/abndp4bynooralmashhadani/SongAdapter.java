package com.example.abndp4bynooralmashhadani;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list_item, parent, false);
        Song currentSong = getItem(position);
        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currentSong.getImageResourceID());
        TextView songName = listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());
        TextView artistName = listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getArtistName());
        ImageButton playButton = listItemView.findViewById(R.id.play_button);
        playButton.setFocusable(false);

        return listItemView;
    }
}
