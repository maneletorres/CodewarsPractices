package codewarspracticesjava;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Mumbling"'''
 * 
 * '''Description:'''
 * This time no story, no theory. The examples below show you how to write 
 * function accum.
 * 
 * '''Notes:'''
 * The parameter of accum is a string which includes only letters from a..z and 
 * A..Z.
 * 
 * '''Examples:'''
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt
 * 
 */
public class Mumbling {
    public static void main(String[] args){
        System.out.println("The result of applying the 'Mumbling' function to the string 'RqaEzty' is " + accum("RqaEzty") + ".");
    }
    
    public static String accum(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j <= i; j++){
                if(j == 0){
                    result += Character.toString(s.charAt(i)).toUpperCase();
                } else {
                    result += Character.toString(s.charAt(i)).toLowerCase();
                }                
            }
            
            if(i < s.length() - 1){
                result += "-";
            }
        }
        
        return result;
    } 
}