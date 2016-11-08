import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Sock Merchant
// https://www.hackerrank.com/challenges/sock-merchant
public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        int pairCounter = 0;
        Set<Integer> sockTypes = new HashSet<Integer>();
        int socks = 0;
        for(int i = 0; i < n; i++) {
            if(!sockTypes.contains(Integer.valueOf(c[i]))) {
                sockTypes.add(Integer.valueOf(c[i]));
                for(int j = 0; j < n; j++) {
                    if(c[i] == c[j]) {
                        socks++;
                    }
                }
                pairCounter += socks / 2;
                socks = 0;
            }
        }

        System.out.println(pairCounter);
    }
}
