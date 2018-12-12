package codewarspractices;

/**
 *
 * @author Manuel Espinosa Torres
 * 
 * '''Codewars exercise: "Complementary DNA"'''
 * 
 * '''Description:''
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and 
 * carries the "instructions" for the development and functioning of living 
 * organisms.
 * 
 * If you want to know more http://en.wikipedia.org/wiki/DNA
 * 
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and
 * "G". You have function with one side of the DNA (string, except for Haskell);
 * you need to get the other complementary side. DNA strand is never empty or 
 * there is no DNA at all (again, except for Haskell).
 * 
 * More similar exercise are found here http://rosalind.info/problems/list-view/
 * (source).
 * 
 * '''Examples:'''
 * DnaStrand.makeComplement("ATTGC") // return "TAACG"
 * DnaStrand.makeComplement("GTAT") // return "CATA"
 * 
 */
public class DnaStrand {
    public static void main(String[] args){
        String chain = "ATTGC";
        System.out.println("The result of applying the 'Complementary DNA' function to the string '" + chain + "' is: " + makeComplement(chain) + ".");
    }
    
    public static String makeComplement(String dna) {
      String aux = "";
      for(int i = 0; i < dna.length(); i++){
        switch(dna.charAt(i)){
          case 'A':
            aux += 'T';
          break;
          case 'T':
            aux += 'A';
          break;
          case 'C':
            aux += 'G';
          break;
          case 'G':
            aux += 'C';
          break;
        }
      }

      return aux;
    }
}