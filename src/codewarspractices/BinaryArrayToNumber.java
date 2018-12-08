package codewarspractices;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Ones and Zeros"'''
 * 
 * '''Description:'''
 * Given an array of one's and zero's convert the equivalent binary value to an integer.
 * 
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 *
 * '''Examples:'''
 * Testing: [0, 0, 0, 1] ==> 1
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 0, 1] ==> 5
 * Testing: [1, 0, 0, 1] ==> 9
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 1, 0] ==> 6
 * Testing: [1, 1, 1, 1] ==> 15
 * Testing: [1, 0, 1, 1] ==> 11
 * 
 * However, the arrays can have varying lengths, not just limited to 4.
 * 
 */
public class BinaryArrayToNumber {
    public static void main(String[] args){
        List<Integer> binary = Arrays.asList(0, 1, 0, 1);
        System.out.println("Testing: [" + binary.get(0) + ", " + binary.get(1) + ", " + binary.get(2) + ", " + binary.get(3) + "] ==> " + ConvertBinaryArrayToInt(binary)); 
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int aux = binary.size() - 1;
        
        for(int i = 0; i < binary.size(); i++, aux--){
            if(binary.get(i) == 1){
                result += Math.pow(2, aux);
            }
        }
        
        return result;
    }
}