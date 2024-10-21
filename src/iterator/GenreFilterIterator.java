package iterator;

import java.util.*;

class GenreFilterIterator implements Iterator<Song> {
    private List<Song> songs;
    private int position = 0;
    private String genre;
    private List<Song> filteredSongs;

    public GenreFilterIterator(List<Song> songs, String genre) {
        this.songs = songs;
        this.genre = genre;
        filterSongsByGenre();
    }

    private void filterSongsByGenre() {
        filteredSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getGenre().equalsIgnoreCase(genre)) {
                filteredSongs.add(song);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return position < filteredSongs.size();
    }

    @Override
    public Song next() {
        return filteredSongs.get(position++);
    }
}

