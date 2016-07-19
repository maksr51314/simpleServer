package com.netent.games.simplegames.logger;

/**
 * Created by maxim.romaniv on 19.07.2016.
 */
public class Logger {

    public static void showCoins(int coins) {
        System.out.println(coins);
    }

    public static void showError(String errText) {
        System.out.println(errText);
    }

    public static void showRTP(int num) {
        System.out.println("RTP : " + num);
    }

}
