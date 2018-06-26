package com.example.android.music;

/**
 * contains both song and artist name
 */
public class songs {

    /**
     * the artist name
     */
    private String ArtistName;

    /**
     * the song title
     */
    private String SongTile;

    /**
     * Create a new song title and artist name object.
     *
     * @param ArtistName for the artist name
     * @param SongTile   for the song tile
     */
    public songs(String ArtistName, String SongTile) {
        ArtistName = ArtistName;
        SongTile = SongTile;
    }

    /**
     * Get the artist name.
     */
    public String getArtistName() {
        return ArtistName;
    }

    /**
     * Get the song tile
     */
    public String getSongTile() {
        return SongTile;
    }


}

