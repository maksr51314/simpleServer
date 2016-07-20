package com.netent.games.simplegames.random;

public class Random {

    public int randInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
