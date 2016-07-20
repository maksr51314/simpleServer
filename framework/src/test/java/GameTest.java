import com.netent.games.simplegames.Game;
import com.netent.games.simplegames.machine.Machine;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class GameTest {

    @Test
    public void testSpendingMoney() {
        Game game = new Game(new Machine());
        int spendMoney = game.getSpendMoney();

        game.play();

        assertNotEquals(spendMoney, game.getSpendMoney());
    }


}
