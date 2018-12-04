package Codewars;

import java.util.Scanner;

/**
 *
 * @author Manuel Espinosa Torres
 */
public class Printer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the series of letters: ");
        String answer = scanner.nextLine();
        
        try {
            System.out.println("error_printer(s) => \"" + printerError(answer) + "\"");
        } catch(NumberFormatException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    
    public static String printerError(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < 97 || s.charAt(i) > 109){
                count++;
            }
        }
        
        return count + "/" + s.length();
    }
}