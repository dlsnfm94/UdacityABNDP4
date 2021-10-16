package com.example.abndp4bynooralmashhadani;

public class Song {
    private String mSongName;
    private String mAlbumName;
    private String mArtistName;
    private String mReleaseDate;
    private int mImageResourceId;

    public Song(String songName, String albumName, String artistName, String releaseDate, int imageResourceId) {
        mSongName = songName;
        mAlbumName = albumName;
        mArtistName = artistName;
        mReleaseDate = releaseDate;
        mImageResourceId = imageResourceId;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public int getImageResourceID() {
        return mImageResourceId;
    }
}
