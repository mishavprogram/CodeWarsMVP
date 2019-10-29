package level8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveCharsTest {

    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }

    @Test
    public void testRemoval2() {
        assertEquals("loquen", RemoveChars.remove2("eloquent"));
        assertEquals("ountr", RemoveChars.remove2("country"));
        assertEquals("erso", RemoveChars.remove2("person"));
        assertEquals("lac", RemoveChars.remove2("place"));
    }
}
