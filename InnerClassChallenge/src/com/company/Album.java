package com.company;

import java.util.ArrayList;

public class Album {
	private String title;
    private SongList songList;

	public Album(String title) {
		this.title = title;
		this.songList = this.new SongList();
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<Song> getSongs() {
		return this.songList.getSongs();
	}

	public boolean addSong(String name, double duration) {
	    return this.songList.addSong(name, duration);
    }

    public Song findSong(String name) {
	    return this.songList.findSong(name);
    }

    // Inner Class, SongList
    private class SongList {
        private ArrayList<Song> songs = new ArrayList<>();

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public boolean addSong(String name, double duration) {
            if (findSong(name) != null) {
                return false;
            }

            this.songs.add(new Song(name, duration));
            return true;
        }

        public Song findSong(String name) {
            for (int i = 0; i < this.songs.size(); i++) {
                Song song = this.songs.get(i);
                if (song.getTitle().equals(name)) {
                    return song;
                }
            }
            return null;
        }

    }
}
