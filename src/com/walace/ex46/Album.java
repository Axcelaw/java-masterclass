package com.walace.ex46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) != null)
            return false;

        this.songs.add(new Song(songTitle, songDuration));
        return true;
    }

    private Song findSong(String songTitle) {
        for (Song currentSong: this.songs) {
            if (currentSong.getTitle().equals(songTitle))
                return currentSong;
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song checkedSong = findSong(songTitle);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in this album");
        return false;
    }
}
