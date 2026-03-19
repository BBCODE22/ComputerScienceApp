package nclan.ac.cs.topic1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionControllerTest {

    @Test
    void convertDecimalToBinary() {
        assertEquals("111", Conversion.convertDecimalToBinary(7));
        assertEquals("1111", Conversion.convertDecimalToBinary(15));
        assertEquals("111", Conversion.convertDecimalToBinary(31));
        assertEquals("111", Conversion.convertDecimalToBinary(12));
    }

    @Test
    void convertDecimalToHex() {
    }

    @Test
    void convertBinaryToDecimal() {
    }

    @Test
    void convertBinaryToHex() {
    }

    @Test
    void convertHexToDecimal() {
    }

    @Test
    void convertHexToBinary() {
        assertEquals("11111010", Conversion.convertHexToDecimal("FA"));
    }
}