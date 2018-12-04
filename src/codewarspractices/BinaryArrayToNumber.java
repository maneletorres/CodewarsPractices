package Codewars;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Manuel Espinosa Torres
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
