package iterator;

import java.util.*;

class ShuffleIterator implements Iterator<Song> {
    private List<Song> songs;
    private int position = 0;
    private List<Song> shuffledSongs;

    public ShuffleIterator(List<Song> songs) {
        this.songs = new ArrayList<>(songs);
        shuffleSongs();
    }

    private void shuffleSongs() {
        shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs);
    }

    @Override
    public boolean hasNext() {
        return position < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(position++);
    }
}

