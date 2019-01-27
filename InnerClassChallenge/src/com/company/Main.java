package com.company;

public class Main {

    public static void main(String[] args) {
        Album dookie = new Album("Dookie");
        dookie.addSong("She", 3.00);
        dookie.addSong("When I Come Around", 2.30);
        dookie.addSong("Basket Case", 2.9);

        Album singTheSorrow = new Album("Sing the Sorrow");
        singTheSorrow.addSong("Girl's Not Grey", 3.16);
        singTheSorrow.addSong("The Leaving Song", 2.73);

        Player player = new Player();
        player.addAlbum(dookie);
        player.addAlbum(singTheSorrow);
        player.addSongToPlaylist("Dookie", "She");
        player.addSongToPlaylist("Sing the Sorrow", "Girl's Not Grey");
        player.addSongToPlaylist("Dookie", "Basket Case");

        player.play();
    }
}
