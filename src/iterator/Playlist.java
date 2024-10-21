package iterator;

import java.util.*;

class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Iterator<Song> getSequentialIterator() {
        return new SequentialIterator(songs);
    }

    public Iterator<Song> getShuffleIterator() {
        return new ShuffleIterator(songs);
    }

    public Iterator<Song> getGenreFilterIterator(String genre) {
        return new GenreFilterIterator(songs, genre);
    }
}

