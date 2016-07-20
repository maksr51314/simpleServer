package bonusMachine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusMachineTest {

    @Test
    public void testRTP() {
        BonusMachine machine = new BonusMachine();

        for(int i = 0; i <= 10000000; i++) {
            machine.spin();
        }

        float a = machine.getRTP();

        assertEquals(0.11, machine.getRTP(), 0.01);
    }

}
