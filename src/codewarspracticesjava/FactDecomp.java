package codewarspracticesjava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Manuel Espinosa Torres
 *
 * '''Codewars exercise: "Factorial decomposition"'''
 *
 * '''Description:''' The aim of the kata is to decompose n! (factorial n) into
 * its prime factors.
 *
 * Prime numbers should be in increasing order. When the exponent of a prime is
 * 1 don't put the exponent.
 *
 * '''Examples:''' n = 12; decomp(12) -> "2^10 * 3^5 * 5^2 * 7 * 11" n = 22;
 * decomp(22) -> "2^19 * 3^9 * 5^4 * 7^3 * 11^2 * 13 * 17 * 19" n = 25;
 * decomp(25) -> 2^22 * 3^10 * 5^6 * 7^3 * 11^2 * 13 * 17 * 19 * 23
 *
 * '''Notes:''' - the function is decomp(n) and should return the decomposition
 * of n! into its prime factors in increasing order of the primes, as a string.
 * - factorial can be a very big number (4000! has 12674 digits, n will go from
 * 300 to 4000).
 *
 */
public class FactDecomp {

    public static void main(String[] args) {
        System.out.println(decomp(17));
    }

    public static String decomp(int n) {
        String result = "";

        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            int aux = i;
            int divisor = 2;
            while (aux > 1) {
                if (aux % divisor == 0) {
                    aux = aux / divisor;
                    if (!numbers.containsKey(divisor)) {
                        numbers.put(divisor, 1);
                    } else {
                        numbers.put(divisor, numbers.get(divisor) + 1);
                    }
                    divisor = 2;
                } else {
                    divisor++;
                }
            }
        }

        Object[] a = numbers.entrySet().toArray();
        Arrays.sort(a, (Object o1, Object o2) -> ((Map.Entry<Integer, Integer>) o2).getKey()
                .compareTo(((Map.Entry<Integer, Integer>) o1).getKey()));

        for (int j = a.length - 1; j >= 0; j--) {
            if (j != a.length - 1) {
                result += " * ";
            }

            if (((Map.Entry<Integer, Integer>) a[j]).getValue().equals(1)) {
                result += ((Map.Entry<Integer, Integer>) a[j]).getKey();
            } else {
                result += ((Map.Entry<Integer, Integer>) a[j]).getKey() + "^" + ((Map.Entry<Integer, Integer>) a[j]).getValue();
            }
        }

        return result;
    }
}
