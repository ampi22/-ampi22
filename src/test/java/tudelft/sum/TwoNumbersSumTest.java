package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void testSameLengthWithoutCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2, 4, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(5, 6, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(8, 0, 7)); // 243 + 564 = 807
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));
        System.out.print("First nr. =" + first);
        System.out.print("Second nr. =" + second);
        System.out.print("Expected =" + expected);
    }

    @Test
    public void testSameLengthWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0, 0)); // 999 + 1 = 1000
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));

    }

    @Test
    public void testDifferentLengthsWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 8));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(7, 5, 6));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7, 7, 4)); // 18 + 756 = 774
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    public void testAllZeroes() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(0, 0, 0));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(0, 0));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0)); // 000 + 00 = 0
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));
    }

    @Test
    public void testEmptyLists() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0)); // Empty input should yield 0
        Assertions.assertEquals(expected, sum.addTwoNumbers(first, second));
    }
}