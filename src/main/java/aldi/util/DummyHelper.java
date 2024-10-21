package aldi.util;

import java.util.ArrayList;
import java.util.List;

public class DummyHelper {
    public static String[] filterByDivisors(int[] numbers, int[] divisors) {
        List<Integer> divisibleNumbers = new ArrayList<>();
        List<String> r = new ArrayList<>();
        int limit = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (!hasDivisable(n, divisors)) {
                continue;
            } else {
                divisibleNumbers.add(n);
            }
        }

        for (int d : divisibleNumbers) {
            r.add(String.valueOf(d));
        }

        return r.toArray(new String[0]);
    }

    private static boolean hasDivisable(int number, int[] divisors) {
        boolean isDivisable = true;

        for (int divisor : divisors) {
            if (number % divisor != 0) {
                isDivisable = false;
            }
        }

        return isDivisable;
    }
}
