package codewarspracticesjava;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Which are in?"'''
 * 
 * '''Description:'''
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 * 
 * '''Notes:'''
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 *
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 *
 * Beware: r must be without duplicates.
 * Don't mutate the inputs.
 * 
 * '''Examples:'''
 * #Example 1: 
 * a1 = ["arp", "live", "strong"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns ["arp", "live", "strong"]
 *
 * #Example 2:
 * a1 = ["tarp", "mice", "bull"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns []
 * 
 */
public class WhichAreIn {
    public static void main(String[] args){
        String[] array1 = {"arp", "live", "strong"};
        String[] array2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        
        String[] result = inArray(array1, array2);
        
        System.out.println("Content of array 1: ");
        for(int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        
        System.out.println("\nContent of array 2: ");
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
        
        System.out.println("\nStrings of array 1 contained in array 2:");
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
    
    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> aux = new ArrayList<>();
        
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array1.length; j++){
                if(array2[i].contains(array1[j]) && !aux.contains(array1[j])){
                    aux.add(array1[j]);
                }
            }
        }
        
        String[] vector = new String[aux.size()];
        vector = aux.toArray(vector);
        Arrays.sort(vector);
        
        return vector;
    }
}