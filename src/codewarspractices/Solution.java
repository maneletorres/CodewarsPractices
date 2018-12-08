package codewarspractices;

import java.util.Scanner;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Multiplies of 3 or 5"'''
 * 
 * '''Description:'''
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

 * '''Note:'''
 * If the number is a multiple of both 3 and 5, only count it once.
 * 
 */
public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        String answer = scanner.nextLine();
        
        try {
            System.out.println("The sum of the multiples of 3 and 5 between 0 and " + answer + " is " + solution(Integer.parseInt(answer)) + ".");
        } catch(NumberFormatException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    
    public static int solution(int number) {
        int result = 0;

        for(int i = 0; i < number; i++){
            if(i % 3 == 0 || i % 5 == 0){
                result += i;
            }
        }

        return result;
    }
}
