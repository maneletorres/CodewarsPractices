package codewarspractices;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Take a number and sum its digits raised to the 
 * consecutive powers and ¡¡Eureka!!"'''
 * 
 * '''Description:'''
 * The number 89 is the first integer with more than one digit that fulfills the
 * property partially introduced in the title of this kata. What's the use of 
 * saying "Eureka"? Because this sum gives the same number.
 * 
 * In effect: 89 = 8^1 + 9^2
 * 
 * The next number in having this property is 135.
 * 
 * See this property again: 135 = 1^1 + 3^2 + 5^3
 *
 * We need a function to collect these numbers, that may receive two integers a,
 * b that defines the range [a, b] (inclusive) and outputs a list of the sorted 
 * numbers in the range that fulfills the property described above.
 * 
 * '''Examples:'''
 * sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
 * sum_dig_pow(90, 100) == []
 * 
 */
public class SumDigPower {
    public static void main(String[] args){
        long index1 = 0;
        long index2 = 200;
        
        List<Long> list = sumDigPow(index1, index2);
        System.out.println("EUREKA !! Result of looking for the numbers that "
                + "meet the condition of being equal to the sum of their high "
                + "digits to consecutive powers between " + index1 + " and " + index2 + ": ");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> list = new ArrayList<>();
        for(long i = a; i <= b; i++){
            long sum = 0;
            String number = String.valueOf(i);
            for(int j = 0; j < number.length(); j++){
                sum += Math.pow(Integer.parseInt(Character.toString(number.charAt(j))), j+1);
            }
            
            if(i == sum){
                list.add(i);    
            }
        }
        
        return list;
    }
}