package algods.examples.stdlib;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListDemoTest {
    private final ByteArrayOutputStream newOut = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(newOut));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    /**
     * @return Die erwartete Ausgabe bei einem Lauf von ListDemo.runDemo
     */
    String expectedOutput() {
        return String.join("\n",
                "l1: [42, 25, 16, 3, 55, 17, 38]",
                "Länge von l1: 7",
                "l1: [42, 25, 3, 55, 17, 38]",
                "l2: [3, 55]",
                "l1: [42, 25, 3, 105, 17, 38]",
                "l2: [3, 105]",
                "l1: [42, 25, 3, 105, 350, 250, 150, 17, 38]",
                "l2: [3, 105, 350, 250, 150]",
                "l1: [3, 17, 25, 38, 42, 105, 150, 250, 350]",
                "l1: [350, 250, 150, 105, 42, 38, 25, 17, 3]",
                "l1: [350, 250, 150, 105, 42, 38, 25, 17, 3]",
                "");
    }

    /**
     * testListDemoForArrayList führt runDemo() mit einer ArrayList aus und prüft,
     * ob die Konsolenausgabe dem von expectedOutput() gelieferten String
     * entspricht.
     */
    @Test
    public void testListDemoForArrayList() {
        // runDemo() mit einer ArrayList ausführen:
        ListDemo.runDemo(new ArrayList<>());
        assertEquals(expectedOutput(), newOut.toString());
    }

    /**
     * testListDemoForVector führt runDemo() mit einem Vector aus und prüft,
     * ob die Konsolenausgabe dem von expectedOutput() gelieferten String
     * entspricht.
     */
    @Test
    public void testListDemoForVector() {
        // runDemo() mit einer ArrayList ausführen:
        ListDemo.runDemo(new Vector<>());
        assertEquals(expectedOutput(), newOut.toString());
    }

    /**
     * testListDemoForLinkedList führt runDemo() mit einer LinkedList aus und prüft,
     * ob die Konsolenausgabe dem von expectedOutput() gelieferten String
     * entspricht.
     */
    @Test
    public void testListDemoForLinkedList() {
        // runDemo() mit einer ArrayList ausführen:
        ListDemo.runDemo(new LinkedList<>());
        assertEquals(expectedOutput(), newOut.toString());
    }
}
