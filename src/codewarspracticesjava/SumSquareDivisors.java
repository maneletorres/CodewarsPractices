package codewarspracticesjava;

/**
 *
 * @author Manuel Espinosa Torres
 *
 * '''Codewars exercise: "Integers: Recreation One"'''
 *
 * '''Description:''' Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These
 * divisors squared are: 1, 4, 9, 36, 49, 196, 441, 1764. The sum of the squared
 * divisors is 2500 which is 50 * 50, a square!
 *
 * Given two integers m, n we want to find all integers between m and n whose
 * sum of squared divisors is itself a square. 42 is such a number.
 *
 * The result will be an array of arrays or of tuples (in C an array of Pair) or
 * a string, each subarray having two elements, first the number whose squared
 * divisors is a square and then the sum of the squared divisors.
 *
 * '''Examples:''' list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
 * list_squared(42, 250) --> [[42, 2500], [246, 84100]]
 *
 */
public class SumSquareDivisors {

    public static void main(String[] args) {
        long number1 = 1;
        long number2 = 250;
        System.out.println("The numbers whose sum of divisors is a whole "
                + "square root between the numbers " + number1 + " and "
                + number2 + " is [1: number, 2: sum of squared divisors]: --> "
                + listSquared(number1, number2));
    }

    public static String listSquared(long m, long n) {
        String result = "[";
        for (long i = m; i <= n; i++) {
            long aux = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    aux += Math.pow(j, 2);
                }
            }

            if (i == 1 || Math.sqrt(aux) % 2 == 0) {
                if (result.length() == 1) {
                    result += "[" + i + ", " + aux + "]";
                } else {
                    result += ", [" + i + ", " + aux + "]";
                }
            }
        }

        return result + "]";
    }
}
