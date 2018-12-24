package codewarspracticesjava;

/**
 *
 * @author Manuel Espinosa Torres
 *
 * '''Codewars exercise: "Square Every Digit"'''
 *
 * '''Description:''' Welcome. In this kata, you are asked to square every digit
 * of a number.
 *
 * '''Examples:''' If we run 9119 through the function, 811181 will come out,
 * because 92 is 81 and 12 is 1.
 *
 * '''Note:''' The function accepts an integer and returns an integer.
 *
 */
public class SquareDigit {

    public static void main(String[] args) {
        int number1 = 3449;
        System.out.println("The result of calculating the square of the digits "
                + "of the number '" + number1 + "' is: " + squareDigits(number1));
    }

    public static int squareDigits(int n) {
        String result = "";
        while (n > 0) {
            result = (int) Math.pow(n % 10, 2) + result;
            n /= 10;
        }

        return Integer.parseInt(result);
    }
}
