package bonusMachine;

import com.netent.games.simplegames.machine.Machine;

public class BonusMachine extends Machine {

    private final int BONUS_WIN = 5;
    private final int DEFAULT_BET = 10;

    public BonusMachine() { super(); }

    @Override
    public void spin() {
        wallet.roundPayment(DEFAULT_BET);

        if (hasBonusGame()) {
            playBonus();
        }
    }

    private void playBonus() {
        int i;

        for (i = 0; i < 4; i++) {
            //last round or player chose 0 - exit num
            if (random.randInt(0, 4) == 0) {
                break;
            } else {
                wallet.addMoney(BONUS_WIN);
            }
        }

    }

    private boolean hasBonusGame() {
        return random.randInt(0, 100) < 10;
    }
}
