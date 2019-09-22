package at.kurzgeschichteninjava.inheritance;

public abstract class Product {
    private String name;
    private double purchasePrice; // Verkaufspreis

    public String getName() {
        return name;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public Product(String name, double purchasePrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
    }

    // getMinutes eine virtuelle Methode
    public int getMinutes() {
        return 3;
    }

    public abstract double getIncredientsCosts();

    @Override
    public String toString() {
        return String.format("%s €%.2f", name, purchasePrice);
    }
}