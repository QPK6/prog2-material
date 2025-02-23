package algods.examples.stdlib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
    public static void runDemo(List<Integer> l1) {
        // Füge Elemente hinzu:
        l1.add(42);
        l1.add(25);
        l1.add(16);
        l1.add(3);
        l1.add(55);
        l1.add(17);
        l1.add(38);

        // Liste ausgeben:
        System.out.printf("l1: %s\n", l1);

        // Länge der Liste ausgeben:
        System.out.printf("Länge von l1: %d\n", l1.size());

        // Das Element an Position 2 löschen und die Liste ausgeben:
        l1.remove(2);
        System.out.printf("l1: %s\n", l1);

        // Eine Teil-Liste extrahieren und ausgeben:
        var l2 = l1.subList(2, 4);
        System.out.printf("l2: %s\n", l2);

        // Ein Element in der Teil-Liste verändern und beide ausgeben:
        // Beobachtung: Beide Listen sind geändert!
        l2.set(1, 105);
        System.out.printf("l1: %s\n", l1);
        System.out.printf("l2: %s\n", l2);

        // Mehrere Elemente ans Ende von l2 anhängen:
        // Beobachtung: Die Elemente werden auch in die Mitte von l1 eingefügt!
        l2.addAll(List.of(350, 250, 150));
        System.out.printf("l1: %s\n", l1);
        System.out.printf("l2: %s\n", l2);

        // Die Elemente von l1 in "natürlicher" Reihenfolge sortieren:
        l1.sort(null);
        System.out.printf("l1: %s\n", l1);

        // Die Elemente von l1 in absteigender Reihenfolge sortieren:
        Collections.reverse(l1);
        Collections.sort(l1); // Alternative zu l1.sort().
        Collections.reverse(l1);
        System.out.printf("l1: %s\n", l1);

        // Die Elemente wieder durcheinander würfeln und erneut absteigend sortieren:
        // Dieses Mal wird zum Sortieren ein "Lambda-Ausdruck" als "Komparator"
        // verwendet.
        Collections.shuffle(l1);
        Collections.sort(l1, (left, right) -> right - left);
        System.out.printf("l1: %s\n", l1);
    }

    public static void main(String[] args) {
        System.out.println("Demo für ArrayList:");
        runDemo(new ArrayList<>());
        System.out.println();

        System.out.println("Demo für Vector:");
        runDemo(new Vector<>());
        System.out.println();

        System.out.println("Demo für LinkedList:");
        runDemo(new LinkedList<>());
        System.out.println();
    }
}
