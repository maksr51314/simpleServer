import slotMachine.SlotMachine;

public class SlotGame {

    SlotGame() {

        SlotMachine slotMachine = new SlotMachine();
        slotMachine.spin();

    }

    public static void main(String[] args) {
        int i;

        SlotMachine slotMachine = new SlotMachine();

        for (i = 0; i <= 20; i++) {
            slotMachine.spin();
        }

        slotMachine.showRTP();

    }

}
