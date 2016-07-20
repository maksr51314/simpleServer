package bonusMachine;

import com.netent.games.simplegames.logger.Logger;
import com.netent.games.simplegames.money.Wallet;
import com.netent.games.simplegames.random.Random;

public class BonusMachine {

    private final int BONUS_WIN = 5;

    private Wallet wallet;
    private Random random;

    public BonusMachine() {
        int startCoins = 100000000;
        wallet = new Wallet(startCoins);
        random = new Random();
    }

    public void spin() {

        int DEFAULT_WIN = 20;
        int DEFAULT_BET = 10;

        wallet.roundPayment(DEFAULT_BET);

//        if (hasWin()) {
//            wallet.addMoney(DEFAULT_WIN);
//        }

        if (hasBonusGame()) {

            playBonus();
//            wallet.addMoney(DEFAULT_BET);
        }

    }

    private void playBonus() {
        for (int i = 0; i < 5; i++) {
            //last round or player chose 0 - exit num
            if (random.randInt(0, 4) == 0 || i == 4) {
                break;
            } else {
                wallet.addMoney(BONUS_WIN);
            }
        }
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

    private boolean hasBonusGame() {
        return random.randInt(0, 100) < 10;
    }

    private boolean hasWin() {
        return random.randInt(0, 100) < 30;
    }

}
