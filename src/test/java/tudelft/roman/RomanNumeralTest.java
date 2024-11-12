package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @BeforeEach
    public void initialize() {
        System.out.print("This method is call before each test!\n");
    }


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);

    }

    @Test
    public void numberMyBirthYear() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MCMLXXV");
        Assertions.assertEquals(1975, result);
    }

    @Test
    public void invalidRomanNumber() {
        RomanNumeral roman = new RomanNumeral();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            roman.convert("VX"); // Invalid Roman numeral
        });
    }


}
