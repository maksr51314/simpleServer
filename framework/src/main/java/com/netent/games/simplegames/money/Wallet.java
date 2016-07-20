package com.netent.games.simplegames.money;

import com.netent.games.simplegames.logger.Logger;

public class Wallet {

    private int currentPayment;
    private int allPays = 0;
    private int allWins = 0;

    public Wallet(int coins) {
        this.currentPayment = coins;
    }

    public void roundPayment(int coins) {

        if (this.currentPayment >= coins) {
            this.currentPayment -= coins;
            this.allPays += coins;
        } else {
            Logger.showError("User bet can't be more then money at wallet");
            //as coins are infinitive

        }

    }

    public void addMoney(int coins) {
        this.currentPayment += coins;
        this.allWins += coins;
    }

    public int getAllPays() {
        return this.allPays;
    }

    public int getAllWins() {
        return this.allWins;
    }

}
