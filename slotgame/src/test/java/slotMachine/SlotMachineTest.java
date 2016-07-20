package slotMachine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlotMachineTest {


    @Test
    public void testRTP() {
        SlotMachine machine = new SlotMachine();

        for(int i = 0; i <= 1000000; i++) {
            machine.spin();
        }

        float rtp = machine.getRTP(); //0.66073817

        assertEquals(0.6, rtp, 0.1);
    }


}
