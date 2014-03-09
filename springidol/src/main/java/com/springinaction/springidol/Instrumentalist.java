package com.springinaction.springidol;

/**
 * Created by varunverma on 9/03/2014.
 */
public class Instrumentalist implements Performer {
    private Instrument instrument;
    private String song;

    public Instrumentalist() {
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}
