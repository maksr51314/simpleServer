package slotMachine;

import com.netent.games.simplegames.machine.Machine;

public class SlotMachine extends Machine {

    private final int DEFAULT_WIN = 20;
    private final int DEFAULT_BET = 10;

    public SlotMachine() { super(); }

    @Override
    public void spin() {

        int a = getAllPays();

        int b=  1;

       wallet.roundPayment(DEFAULT_BET);

        if (hasWin()) {
            wallet.addMoney(DEFAULT_WIN);
        }

        if (hasFreeRound()) {
            wallet.addMoney(DEFAULT_BET);
        }

    }

    private boolean hasFreeRound() {
        return random.randInt(0, 100) < 10;
    }

    private boolean hasWin() {
        return random.randInt(0, 100) < 30;
    }

}

