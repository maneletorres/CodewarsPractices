package codewarspracticesjava;

/**
 *
 * @author Manuel Espinosa Torres
 *
 * '''Codewars exercise: "Highest Scoring Word"'''
 *
 * '''Description:''' Given a string of words, you need to find the highest
 * scoring word.
 *
 * Each letter of a word scores points according to it's position in the
 * alphabet: a = 1, b = 2, c = 3 etc.
 *
 * You need to return the highest scoring word as a string.
 *
 * If two words score the same, return the word that appears earliest in the
 * original string.
 *
 * All letters will be lowercase and all inputs will be valid.
 *
 */
public class High {

    public static void main(String[] args) {
        String outputHeader = "The result of searching for the word with the "
                + "highest score in the phrase '";

        String phrase1 = "man i need a taxi up to ubud";
        String phrase2 = "what time are we climbing up to the volcano";
        String phrase3 = "take me to semynak";
        String phrase4 = "kcit wqi jehekj upd jefl";

        System.out.println(outputHeader + phrase1 + "' is: " + high(phrase1));
        System.out.println(outputHeader + phrase2 + "' is: " + high(phrase2));
        System.out.println(outputHeader + phrase3 + "' is: " + high(phrase3));
        System.out.println(outputHeader + phrase4 + "' is: " + high(phrase4));
    }

    public static String high(String s) {
        String result = "";
        String[] split = s.split(" ");
        int count = 0;

        for (String aux : split) {
            int currentCount = 0;
            for (char c : aux.toCharArray()) {
                currentCount += c - 96;
            }

            if (currentCount > count) {
                count = currentCount;
                result = aux;
            }
        }

        return result;
    }
}
