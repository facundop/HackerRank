import java.util.Scanner;

// Jumping on the Clouds
// https://www.hackerrank.com/challenges/jumping-on-the-clouds
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int i = 0;
        int jumps = 0;
        while(i < n-1) {
            if(((i + 2) <= n - 1) && (c[i + 2] != 1))  {
                i += 2;
                jumps++;
            } else {
                i++;
                jumps++;
            }
        }
        System.out.println(jumps);
    }
}
