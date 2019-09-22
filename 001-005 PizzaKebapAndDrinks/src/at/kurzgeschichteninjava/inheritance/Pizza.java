package at.kurzgeschichteninjava.inheritance;

public class Pizza extends Product{
    private boolean islarge;

    public boolean isIslarge() {
        return islarge;
    }

    public Pizza(String name, double purchasePrice, boolean islarge) {
        super(name, purchasePrice);
        this.islarge = islarge;
    }

    @Override
    public int getMinutes() {
        return 12;
    }

    // große Pizze kosten 4.5 Euro, kleine Pizze kosten 3 Euro
    @Override
    public double getIncredientsCosts() {
        return islarge ? 4.5 : 3;
    }

    @Override
    public String toString() {
        String size = isIslarge() ? "large" : "small";
        return String.format("Pizza %s (%s)", super.toString(), size);
    }
}
