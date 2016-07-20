package bonusMachine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusMachineTest {

    @Test
    public void testRTP() {
        BonusMachine machine = new BonusMachine();

        for(int i = 0; i <= 1000000; i++) {
            machine.spin();
        }

        assertEquals(0.11, machine.getRTP(), 0.01);
    }

}
