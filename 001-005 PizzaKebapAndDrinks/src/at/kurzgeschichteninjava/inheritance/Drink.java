package at.kurzgeschichteninjava.inheritance;

public class Drink extends Product {
    private Amount amount;

    public Amount getAmount() {
        return amount;
    }

    public Drink(String name, double purchasePrice, Amount amount) {
        super(name, purchasePrice);

        this.amount = amount;
    }

    @Override
    public String toString() {
        String text = "";

        switch( amount )  {
            case _05l: text = "0,5 l"; break;
            case _033l: text = "0,3 l"; break;
            case _025l: text = "0,25 l"; break;
            default: assert false : "Invalid amount!";
        }
        return String.format("%s (%s)", super.toString(), text);
    }

    // 0,5 l -> 1.5 Euro
    // 0,33 l -> 1.2 Euro
    // 0.25 l -> 0.8 Euro
    @Override
    public double getIncredientsCosts() {
        switch (amount)
        {
            case _05l: return 1.5;
            case _033l: return 1.2;
            case _025l: return 0.8;
        }

        assert false : "Invalid amount!";
        return Double.MIN_VALUE;
    }
}
