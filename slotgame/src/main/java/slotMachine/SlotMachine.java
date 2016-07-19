package slotMachine;

import java.util.Random;

import com.netent.games.simplegames.logger.Logger;
import com.netent.games.simplegames.money.Wallet;

public class SlotMachine {

    private Wallet wallet;
    private Random random = new Random(10000000);
    private State state;


    public SlotMachine() {
        int startCoins = 1000000;
        wallet = new Wallet(startCoins);
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

//        if (hasFreeRound()) {
//
//        }

    }

    public void showRTP() {
        Logger.showRTP( (int)((double)this.wallet.getAllWins() / this.wallet.getAllPays() * 100) );
//        Logger.showRTP();
    }

//    private void decreaseRoundCoins() {
//
//        int bet = 10;
//        if (coins < bet) {
//            System.out.println("Coins aren't enough");
//        } else {
//            int ROUND_PAY = 5;
//            coins -= state == State.FREE ? 0 : ROUND_PAY;
//        }
//
//    }

    private boolean hasFreeRound() {
        return this.random.nextInt() < 30;
    }

    private boolean hasWin() {
        return this.random.nextInt() <= 30;
    }


}

