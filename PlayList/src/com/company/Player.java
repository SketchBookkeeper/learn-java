package com.company;

import java.util.*;

public class Player {
	private ArrayList<Album> albums = new ArrayList<>();
	private LinkedList<Song> playlist = new LinkedList<>();

	public void addAlbum(Album album) {
		albums.add(album);
	}

	public Album findAlbum(String name) {
		for (Album album : albums) {
			if (album.getTitle().equals(name)) {
				return album;
			}
		}
		return null;
	}

	public boolean addSongToPlaylist(String albumName, String songName) {
		Album album = findAlbum(albumName);
		if (album == null) {
			System.out.println("Album not available.");
			return false;
		}

		Song song = album.findSong(songName);
		if (song == null) {
			System.out.println("Song not found in album.");
			return false;
		}

		this.playlist.add(song);
		return true;
	}

	public void showPlaylist() {
		Iterator<Song> songs = playlist.iterator();
		while (songs.hasNext()) {
			System.out.println(songs.next().getTitle() + " : " + songs.next().getDuration());
		}
	}

	public void play() {
		showMenu();

		if (this.playlist.isEmpty()) {
			System.out.println("Playlist is empty.");
			return;
		}

		boolean exit = false;
		boolean movingForward = true;
		Scanner scanner = new Scanner(System.in);
		ListIterator<Song> playListIterator = playlist.listIterator();
		Song currentSong = playListIterator.next();

		System.out.println("Now playing " + currentSong.getTitle());

		while (!exit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
				case 0: // Exit
					System.out.println("Quit");
					exit = true;
					break;
				case 1: // Skip Forward
					if (!movingForward) {
						if (playListIterator.hasNext()) {
							playListIterator.next();
						}
						movingForward = true;
					}
					if (playListIterator.hasNext()) {
						currentSong = playListIterator.next();
						System.out.println("Now playing " + currentSong.getTitle());
					} else {
						System.out.println("End of playlist");
					}
					break;
				case 2: // Skip back
					if (movingForward) {
						if (playListIterator.hasPrevious()) {
							playListIterator.previous();
						}
						movingForward = false;
					}
					if (playListIterator.hasPrevious()) {
						currentSong = playListIterator.previous();
						System.out.println("Now playing " + currentSong.getTitle());
					} else {
						System.out.println("Beginning of playlist.");
					}
					break;
				case 3: // Replay
					System.out.println("Now playing " + currentSong.getTitle());
					break;
				case 4: // Remove
					System.out.println("Removed " + currentSong.getTitle());
					playListIterator.remove();

					if (playListIterator.hasNext()) {
						currentSong = playListIterator.next();
					} else if (playListIterator.hasPrevious()) {
						currentSong = playListIterator.previous();
					} else {
						System.out.println("List is empty.");
						exit = true;
					}
					break;
				case 5: // Show Menu
					showMenu();
					break;
			}
		}
	}

	private void showMenu() {
		System.out.println("Options:");
		System.out.println("0 - Quit\n" +
				"1 - Next Song\n" +
				"2 - Previous Song\n" +
				"3 - Replay Current Song\n" +
				"4 - Remove Current Song\n" +
				"5 - Show this menu");
	}
}
