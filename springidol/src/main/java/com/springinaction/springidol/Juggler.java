package com.springinaction.springidol;

/**
 * Created by varunverma on 9/03/2014.
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggler() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
