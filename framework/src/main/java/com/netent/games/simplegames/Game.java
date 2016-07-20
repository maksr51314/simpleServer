package com.netent.games.simplegames;

import com.netent.games.simplegames.machine.Machine;

/**
 * Created by maks on 7/20/16.
 */
public class Game {

    private Machine machine;

    public Game(Machine machine) {
        this.machine = machine;
    }

    public void play() {
        machine.spin();
    }

    public int getSpendMoney() {
        return machine.getAllPays();
    }

}
