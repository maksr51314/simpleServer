package slotMachine;

import java.util.Random;

import com.netent.games.simplegames.logger.Logger;
import com.netent.games.simplegames.money.Wallet;

public class SlotMachine {

    private Wallet wallet;
    private Random random = new Random(10);
    private State state;


    int a;
    int b;

    public SlotMachine() {
        int startCoins = 100000000;
        wallet = new Wallet(startCoins);

        a = 0;
        b = 0;
    }

    private enum State {
        FREE,
        NORMAL
    };

    public void spin() {

        int DEFAULT_WIN = 20;
        int DEFAULT_BET = 10;

        wallet.roundPayment(DEFAULT_BET);

        if (hasWin()) {
            wallet.addMoney(DEFAULT_WIN);
        }

        if (hasFreeRound()) {
            wallet.addMoney(DEFAULT_BET);
        }

    }

    public int getAllPays() {
        return wallet.getAllPays();
    }

    public void showRTP() {
        Logger.showRTP( (float)this.wallet.getAllWins() / this.wallet.getAllPays() );
    }


    private boolean hasFreeRound() {
        return this.randInt(0, 99) < 10;
    }

    private boolean hasWin() {
        return this.randInt(0, 99) < 30;
    }

    /**
     * Initialize a new random number generator that generates
     * random numbers in the range [min, max]
     * @param min - the min value (inclusive)
     * @param max - the max value (inclusive)
     */
    public int randInt(int min, int max) {


        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

}

