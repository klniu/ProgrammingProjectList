import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by klniu on 16-9-24.
 * Pig Latin – Pig Latin is a game of alterations played on the English language game. To create the Pig Latin form of an English word the initial consonant sound is transposed to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay). Read Wikipedia for more information on rules.
 */
public class PigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        while (true) {
            System.out.print("Please input a word or input 'quit' to terminal the program: ");
            str = in.next();
            if (str.equals("quit")) {
                break;
            }
            System.out.println("The reversed string is: " + makePigLatin(str));
        }
    }

    static String makePigLatin(String str) {
        str = str.trim();
        if (str.equals("")) {
            return "";
        }
        final char[] consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L',
                'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
        // first letter is vowel char.
        if (Arrays.binarySearch(consonants, Character.toUpperCase(str.charAt(0))) < 0) {
            return str + "yay";
        }
        StringBuilder result = new StringBuilder(str);
        for (char c :
                str.toCharArray()) {
            if (Arrays.binarySearch(consonants, Character.toUpperCase(c)) > -1) {
                char first = result.charAt(0);
                result.deleteCharAt(0).append(first);
            } else {
                break;
            }
        }
        return result.append("ay").toString();
    }
}
