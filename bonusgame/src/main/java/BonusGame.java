import bonusMachine.BonusMachine;
import com.netent.games.simplegames.Game;

public class BonusGame extends Game {

    BonusGame() {
        super(new BonusMachine());
    }

}
