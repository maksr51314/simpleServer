package com.netent.games.simplegames.random;

/**
 * Created by maks on 7/20/16.
 */
public class Random {

    /**
     * Initialize a new random number generator that generates
     * random numbers in the range [min, max]
     * @param min - the min value (inclusive)
     * @param max - the max value (inclusive)
     */
    public int randInt(int min, int max) {


        java.util.Random rand = new java.util.Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive

        return rand.nextInt((max - min) + 1) + min;
    }
}
