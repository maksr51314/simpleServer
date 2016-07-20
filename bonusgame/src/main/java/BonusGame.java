import bonusMachine.BonusMachine;

public class BonusGame {

    private BonusMachine bonusMachine;

    BonusGame() {
        bonusMachine = new BonusMachine();
    }

    public void play() {
        bonusMachine.spin();
    }

    public int getSpendMoney() {
        return bonusMachine.getAllPays();
    }

    public static void main(String[] arg) {

    }

}
