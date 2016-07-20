import slotMachine.SlotMachine;

public class SlotGame {

    private SlotMachine slotMachine;

    SlotGame() {
        slotMachine = new SlotMachine();
    }

    public void play() {
        slotMachine.spin();
    }

    public int getSpendMoney() {
        return slotMachine.getAllPays();
    }

}
