package com.netent.games.simplegames.machine;

import com.netent.games.simplegames.logger.Logger;
import com.netent.games.simplegames.wallet.Wallet;
import com.netent.games.simplegames.random.Random;

public class Machine {

    protected Wallet wallet;
    protected Random random;

    public Machine() {
        int startCoins = 100000000;
        wallet = new Wallet(startCoins);
        random = new Random();
    }

    public void spin() {
        wallet.roundPayment(10);
        wallet.addMoney(5);
    }

    public int getAllPays() {
        return wallet.getAllPays();
    }

    public void showRTP() {
        Logger.showRTP( getRTP() );
    }

    public float getRTP() {
        return (float)this.wallet.getAllWins() / this.wallet.getAllPays();
    }

}
