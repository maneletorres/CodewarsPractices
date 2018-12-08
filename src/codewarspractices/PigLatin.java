package codewarspractices;

import java.util.regex.Pattern;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * Description: 
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 */
public class PigLatin {
    public static void main(String[] args){
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
    }
    
    public static String pigIt(String str) {
        String result = "";
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            if (Pattern.matches("\\p{Punct}", words[i])) {
                result += words[i];
            } else {
                result += words[i].substring(1) + words[i].charAt(0) + "ay";
            
                if(i != words.length - 1){
                    result += " ";
                }
            }
        }
        
        return result;
    }
}