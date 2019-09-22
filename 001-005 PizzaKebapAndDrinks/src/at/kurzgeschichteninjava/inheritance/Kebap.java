package at.kurzgeschichteninjava.inheritance;

public class Kebap extends Product {

    public Kebap(String name, double purchasePrice) {
        super(name,purchasePrice);
    }

    // Die Zutaten kosten immer 2 Euro.
    @Override
    public double getIncredientsCosts() {
        return 2;
    }
}
