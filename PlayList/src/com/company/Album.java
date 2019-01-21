package com.company;

import java.util.ArrayList;

public class Album {
	private String title;
	private ArrayList<Song> songs = new ArrayList<>();

	public Album(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

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
