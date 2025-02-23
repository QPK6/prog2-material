package algods.examples.dynarray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DynArrayTest {

    @Test
    public void testDynArray_new() {
        DynArray array = new DynArray();

        assertEquals(0, array.size());
    }

    @Test
    public void testDynArray_add() {
        DynArray array = new DynArray();
        array.add(10);
        array.add(20);
        array.add(30);

        assertEquals(3, array.size());
        assertEquals(10, array.get(0));
        assertEquals(20, array.get(1));
        assertEquals(30, array.get(2));
    }
}
