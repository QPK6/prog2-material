package algods.beispiele.greet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetTest {
    @Test
    public void testGreet() {
        assertEquals("Hello World", Greet.greet("World"));
        assertEquals("Hello WWI24AMA", Greet.greet("WWI24AMA"));
    }
}
