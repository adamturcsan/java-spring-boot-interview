package aldi.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DummyHelperTest {
    @Test
    public void testFilterByDivisors_validInput() {
        int[] numbers = {23, 24, 25, 26, 30, 60};
        int[] divisors = {2, 3, 5};

        String[] result = DummyHelper.filterByDivisors(numbers, divisors);
        String[] expected = {"30", "60"};

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterByDivisors_noMatchingNumbers() {
        int[] numbers = {23, 24, 25, 26, 29};
        int[] divisors = {2, 3, 5};

        String[] result = DummyHelper.filterByDivisors(numbers, divisors);
        String[] expected = {};

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterByDivisors_emptyNumbers() {
        int[] numbers = {};
        int[] divisors = {2, 3, 5};

        String[] result = DummyHelper.filterByDivisors(numbers, divisors);
        String[] expected = {};

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterByDivisors_emptyDivisors() {
        int[] numbers = {23, 24, 25, 26, 30, 60};
        int[] divisors = {};

        String[] result = DummyHelper.filterByDivisors(numbers, divisors);
        String[] expected = {"23", "24", "25", "26", "30", "60"};

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterByDivisors_singleDivisor() {
        int[] numbers = {23, 24, 25, 26, 30, 60};
        int[] divisors = {5};

        String[] result = DummyHelper.filterByDivisors(numbers, divisors);
        String[] expected = {"25", "30", "60"};

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFilterByDivisors_singleNumber() {
        int[] numbers = {25};
        int[] divisors = {5};

        String[] result = DummyHelper.filterByDivisors(numbers, divisors);
        String[] expected = {"25"};

        assertArrayEquals(expected, result);
    }
}
