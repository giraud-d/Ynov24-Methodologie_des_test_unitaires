import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicExampleTest {

    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";
        String actual = BasicExample.myUppercase(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testAllLowercase() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actual = BasicExample.myUppercase(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testMixedCase() {
        String input = "Hello, World!";
        String expected = "HELLO, WORLD!";
        String actual = BasicExample.myUppercase(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithSpecialCharacters() {
        String input = "Salut, le monde ! ";
        String expected = "SALUT, LE MONDE ! ";
        String actual = BasicExample.myUppercase(input);
        assertEquals(expected, actual);
    }

    // TODO créer une erreur d'un point de vue fonctionnel
}
