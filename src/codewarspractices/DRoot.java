package codewarspractices;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Sum of Digits / Digital Root"'''
 * 
 * '''Description:''' 
 * In this kata, you must create a digital root function.
 * 
 * A digital root is the recursive sum of all the digits in a number. Given n, 
 * take the sum of the digits of n. If that value has two digits, continue 
 * reducing in this way until a single-digit number is produced. This is only 
 * applicable to the natural numbers.
 * 
 * '''Examples:'''
 * digital_root(16)
 * => 1 + 6
 * => 7
 * 
 * digital_root(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 * 
 * digital_root(132189)
 * => 1 + 3 + 2 + 1 + 8 + 9
 * => 24 ...
 * => 2 + 4
 * => 6
 * 
 * digital_root(493193)
 * => 4 + 9 + 3 + 1 + 9 + 3
 * => 29 ...
 * => 2 + 9
 * => 11 ...
 * => 1 + 1
 * => 2
 * 
 */
public class DRoot {
    public static void main(String[] args){
        int number = 132189;
        System.out.println("The digital root of the number " + number + " is " + digital_root(number) + ".");
    }
    
    public static int digital_root(int n) {
        String aux = Integer.toString(n);

        if(aux.length() == 1){
          return n;
        } else {
          int result = 0;
          for(int i = 0; i < aux.length(); i++){
              result += Integer.parseInt(aux.charAt(i) + "");
          }

          return digital_root(result);
        }
    }
}