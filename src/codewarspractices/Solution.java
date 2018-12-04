package Codewars;

import java.util.Scanner;

/**
 *
 * @author Manel Espinosa Torres
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
        //TODO: Code stuff here
        int result = 0;

        for(int i = 0; i < number; i++){
            if(i % 3 == 0 || i % 5 == 0){
                result += i;
            }
        }

        return result;
    }
}
