package at.kurzgeschichteninjava.inheritance;

/* Kurzgeschichten in Java - Erzählt von Thomas Schlögl
   Entwicklungsumgebung IntelliJ IDEA
   https://www.jetbrains.com/idea/

   Registrierung für Schüler, Studenten und Profs
   https://www.jetbrains.com/shop/eform/students

   "Inheritance" ist englisch für "Vererbung"
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Polymorphie = Vielgestaltigkeit

        // Was links von der Variablen steht, ist ein statischer Typ.
        Product pizza = new Pizza("Venezia", 6.5, true);
        Product kebap = new Kebap( "Ardana Kebap", 4.55 );
        Product drink = new Drink("Cola", 3.5, Amount._025l);

        // Die Instanz selbst, ist der dynamische Typ. Dieser bestimmt welche Methode
        // aufgerufen wird.
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(pizza);
        products.add(kebap);
        products.add(drink);

        for ( Product p : products ) {
            System.out.println(p);
            System.out.printf("  Preparation time: %d min%n", p.getMinutes());
            System.out.printf("  Ingredients price: %g €%n", p.getIncredientsCosts());
        }
    }
}
