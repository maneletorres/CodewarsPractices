package codewarspracticesjava;

import java.util.regex.Pattern;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Simple Pig Latin"'''
 * 
 * '''Description:''' 
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 * 
 * '''Examples:'''
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 * 
 */
public class PigLatin {
    public static void main(String[] args){
        String word1 = "Pig latin is cool";
        String word2 = "Hello world !";
        
        System.out.println("Chain of words 1: " + word1);
        System.out.println("PigIt chain of words 1: " + pigIt(word1));
        
        System.out.println("\nChain of words 2: " + word2);
        System.out.println("PigIt chain of words 2: " + pigIt(word2));
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