package codewarspractices;

import java.util.Arrays;

/**
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "You order, please"'''
 * 
 * '''Description:''' 
 * Your task is to sort a given string. Each word in the 
 * string will contain a single number. This number is the position the 
 * word should have in the result.
 *
 * '''Note:'''
 * Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 *
 * If the input string is empty, return an empty string. The words in the 
 * input String will only contain valid consecutive numbers.
 * 
 * '''Examples:'''
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 * 
 */
public class Order {
    public static void main(String[] args){
        String words1 = "is2 Thi1s T4est 3a";
        String words2 = "4of Fo1r pe6ople g3ood th5e the2";
        
        System.out.println("Chain of words to order 1: " + words1);
        System.out.println("Orderly string of words 1: " + order(words1));
        
        System.out.println("\nChain of words to order 2: " + words2);
        System.out.println("Orderly string of words 2: " + order(words2));
    }
    
    public static String order(String words){
        String[] aux = words.split(" ");
        Arrays.sort(aux, (String o1, String o2) -> {
            String number1 = "";
            for(int i = 0; i < o1.length(); i++){
                if(Character.isDigit(o1.charAt(i))){
                    number1 += o1.charAt(i);
                    break;
                }
            }
            
            String number2 = "";
            for(int i = 0; i < o2.length(); i++){
                if(Character.isDigit(o2.charAt(i))){
                    number2 += o2.charAt(i);
                    break;
                }
            }
            
            return number1.compareTo(number2);
        });
        
        return String.join(" ", aux);
    }
}