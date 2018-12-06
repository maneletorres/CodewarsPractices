/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewarspractices;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Manuel Espinosa Torres
 */
public class WhichAreIn {
    public static void main(String[] args){
        String[] array1 = {"arp", "live", "strong"};
        String[] array2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        
        String[] result = inArray(array1, array2);
        
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