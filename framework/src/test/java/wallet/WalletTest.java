package wallet;

import com.netent.games.simplegames.wallet.Wallet;
import org.junit.Test;

import static javafx.beans.binding.Bindings.greaterThan;
import static javafx.beans.binding.Bindings.lessThan;
import static org.junit.Assert.*;

/**
 * Created by maks on 7/20/16.
 */
public class WalletTest {

    private int pay = 50;
    private int allMoney = 100;

    @Test
    public void testPaysCalculating() {


        Wallet wallet = new Wallet(allMoney);

        wallet.roundPayment(pay);

        assertEquals(wallet.getAllPays(), pay);
    }

    @Test
    public void testWinsCalculating() {
        Wallet wallet = new Wallet(allMoney);

        wallet.addMoney(pay);

        assertEquals(wallet.getAllWins(), pay);
    }

    @Test
    public void testNoMoneyForRound() {
        int times = 10;

        Wallet wallet = new Wallet(allMoney);

        for (int i = 0; i < times; i++) {
            wallet.roundPayment(pay);
        }

        assertTrue((pay*times) > allMoney);
        assertEquals(wallet.getCurrentCoins(), 0);
    }

}
