package com.netent.games.simplegames.wallet;

import com.netent.games.simplegames.logger.Logger;

public class Wallet {

    private int currentCoins;
    private int allPays = 0;
    private int allWins = 0;

    public Wallet(int coins) {
        this.currentCoins = coins;
    }

    public void roundPayment(int coins) {

        if (this.currentCoins >= coins) {
            this.currentCoins -= coins;
            this.allPays += coins;
        } else {
            Logger.showError("User bet can't be more then money at wallet");
            //TODO : add coins if you need infinitive coins at wallet
        }

    }

    public void addMoney(int coins) {
        this.currentCoins += coins;
        this.allWins += coins;
    }

    public int getAllPays() {
        return this.allPays;
    }

    public int getAllWins() {
        return this.allWins;
    }

    public int getCurrentCoins() { return this.currentCoins; }

}
