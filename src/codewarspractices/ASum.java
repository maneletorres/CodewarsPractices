package Codewars;

import java.util.Scanner;

/**
 *
 * @author Manuel Espinosa Torres
 */
public class ASum {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of cubes: ");
        String answer = scanner.nextLine();
        
        try {
            System.out.println("The number of cubes to build the stack is " + findNb(Long.parseLong(answer)) + ".");
        } catch(NumberFormatException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
	
    public static long findNb(long m) {
        long result = 0;

        for(long i = m; i >= 1; i--){
          result += Math.pow(i, 3);
        }

        return result;
    }	
}