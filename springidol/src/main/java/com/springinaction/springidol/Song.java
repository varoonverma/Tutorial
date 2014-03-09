package com.springinaction.springidol;

/**
 * Created by varunverma on 9/03/2014.
 */
public class Song {
    private java.lang.String title;
    private java.lang.String composer;
    private java.lang.String lyrics;

    public Song(java.lang.String title, java.lang.String composer, java.lang.String lyrics) {
        this.title = title;
        this.composer = composer;
        this.lyrics = lyrics;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public java.lang.String getComposer() {
        return composer;
    }

    public java.lang.String getLyrics() {
        return lyrics;
    }
}
