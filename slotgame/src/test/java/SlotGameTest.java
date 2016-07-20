import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class SlotGameTest {

    @Test
    public void testSpendingMoney() {
        SlotGame game = new SlotGame();
        int spendMoney = game.getSpendMoney();

        game.play();

        assertNotEquals(spendMoney, game.getSpendMoney());
    }

}