package codewarspractices;

import java.util.ArrayList;

/**
 *
 * @author Manuel Espinosa Torres
 *
 * '''Codewars exercise: "Primes in numbers"'''
 *
 * '''Description:''' Given a positive number n > 1 find the prime factor
 * decomposition of n. The result will be a string with the following form:
 * "(p1**n1)(p2**n2)...(pk**nk)"
 *
 * '''Examples:''' n = 86240 should return "(2**5)(5)(7**2)(11)"
 *
 */
public class PrimeDecomp {

    public static void main(String[] args) {
        System.out.println(factors(86240));
    }

    public static String factors(int n) {
        ArrayList<Integer> aux = new ArrayList<>();
        String result = "";

        int i = n;
        while (i > 1) {
            int j = 2;
            while (i % j != 0) {
                j++;
            }

            i = i / j;
            aux.add(j);
        }

        int count = 0;
        for (int x = 0; x < aux.size(); x += count) {
            count = 0;
            for (int z = 0; z < aux.size(); z++) {
                if (aux.get(x) == aux.get(z)) {
                    count++;
                }
            }

            if (count == 1) {
                result += "(" + aux.get(x) + ")";
            } else {
                result += "(" + aux.get(x) + "**" + count + ")";
            }
        }

        return result;
    }
}
