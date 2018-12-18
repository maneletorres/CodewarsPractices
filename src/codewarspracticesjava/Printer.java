package codewarspracticesjava;

import java.util.Scanner;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Printer Errors"'''
 * 
 * '''Description:'''
 * In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.
 * 
 * The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...
 * 
 * Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm.
 * 
 * You have to write a function printer_error which given a string will output the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.
 * 
 * The string has a length greater or equal to one and contains only letters from ato z.
 * 
 * '''Examples:'''
 * s="aaabbbbhaijjjm"
 * error_printer(s) => "0/14"
 * 
 * s="aaaxbbbbyyhwawiwjjjwwm"
 * error_printer(s) => "8/22"
 *
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