package codewarspracticesjava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Two to One"'''
 * 
 * '''Description:'''
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new 
 * sorted string, the longest possible, containing distinct letters, each taken 
 * only once - coming from s1 or s2.
 * 
 * '''Examples:'''
 * a = "xyaabbbccdefww" b = "xxxxyyyyabklmopq" longest(a,b) -> "abcdefklmopqwxy"
 * a = "abcdefghijklmnopqrstuvwxyz" longest(a,a) -> "abcdefghijklmnopqrstuvwxyz"
 * 
 */
public class TwoToOne {
    public static void main(String[] args){
        String chain1 = "aretheyhere";
        String chain2 = "yestheyarehere";
        System.out.println("The result of applying the 'Two to One' function to the strings '" + chain1 + "' and '" + chain2 + "' is: " + longest(chain1, chain2) + ".");
    }
    
    public static String longest (String s1, String s2) {
        String aux = s1 + s2, result = "";
        Set<Character> charSet = new LinkedHashSet<>();

        for(int i = 0; i < aux.length(); i++){
          charSet.add(aux.charAt(i));
        }

        for(Character character : charSet){
            result += character;
        }
        
        char[] chars = result.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}