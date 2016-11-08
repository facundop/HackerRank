import java.util.Scanner;


// CamelCase
// https://www.hackerrank.com/challenges/camelcase
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int wordsCounter = 1;

        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                wordsCounter++;
            }
        }

        System.out.println(wordsCounter);
    }
}
