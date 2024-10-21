package iterator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Adding songs to the playlist
        playlist.addSong(new Song("Blinding Lights", "The Weeknd", "Pop"));
        playlist.addSong(new Song("Bad Guy", "Billie Eilish", "Pop"));
        playlist.addSong(new Song("Rockstar", "DaBaby", "Rap"));
        playlist.addSong(new Song("Levitating", "Dua Lipa", "Pop"));
        playlist.addSong(new Song("Sicko Mode", "Travis Scott", "Rap"));

        // Sequential Iterator
        System.out.println("Sequential Order:");
        Iterator<Song> sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        // Shuffle Iterator
        System.out.println("\nShuffle Order:");
        Iterator<Song> shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        // Genre Filter Iterator (Pop songs)
        System.out.println("\nGenre Filter (Pop) Order:");
        Iterator<Song> genreFilterIterator = playlist.getGenreFilterIterator("Pop");
        while (genreFilterIterator.hasNext()) {
            System.out.println(genreFilterIterator.next());
        }
    }
}


