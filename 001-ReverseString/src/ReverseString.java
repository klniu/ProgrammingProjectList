import java.util.Scanner;

/**
 * Created by klniu on 16-9-24.
 * Reverse a String – Enter a string and the program will reverse it and print it out.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a string: ");
        String result = new StringBuilder(in.nextLine()).reverse().toString();
        System.out.print("The reversed string is: " + result);
    }
}
