package ama;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyStringUtilsTest {
    @Test
    void testShiftStringWithANullString() {
        String str = null;
        int number = 12;
        String expected = null;

        assertEquals(MyStringUtils.shiftString(str, number), expected);
    }

    @Test
    void testShiftStringWithAnEmptyString() {
        String str = "";
        int number = 25;
        String expected = "";

        assertEquals(MyStringUtils.shiftString(str, number), expected);
    }

    @Test
    void testShiftStringWithAnOneCharacterString() {
        String str = "x";
        int number = 20;
        String expected = "x";

        assertEquals(MyStringUtils.shiftString(str, number), expected);
    }

    @Test
    void testShiftStringWithAZeroNumber() {
        String str = "Hello world!";
        int number = 0;
        String expected = "Hello world!";

        assertEquals(MyStringUtils.shiftString(str, number), expected);
    } 

    @Test
    void testShiftStringWithANegativeNumber() {
        String str = "Hello world!";
        int number = -2;
        String expected = "llo world!He";

        assertEquals(MyStringUtils.shiftString(str, number), expected);
    } 

    @Test
    void testShiftStringWithAPositiveNumber() {
        String str = "Welcome to String Shifter!";
        int number = 5;
        String expected = "fter!Welcome to String Shi";

        assertEquals(MyStringUtils.shiftString(str, number), expected);
    } 

    @Test
    void testShiftStringWithABigNumber() {
        String str = "Welcome to String Shifter!";
        int number = 60;
        String expected = "Shifter!Welcome to String ";

        assertEquals(MyStringUtils.shiftString(str, number), expected);
    } 


}
