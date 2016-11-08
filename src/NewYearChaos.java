import java.util.Scanner;

// New Year Chaos
// https://www.hackerrank.com/challenges/new-year-chaos
public class NewYearChaos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }
            // your code goes here
            int count = 0;
            boolean tooMuch = false;
            boolean finished = false;
            while (!finished) {
                finished = true;
                for (int i = 0; i < n - 1; i++) {
                    if (q[i] > q[i + 1]) {
                        if((q[i] - (i+1)) > 2) {
                            finished = true;
                            tooMuch = true;
                            break;
                        }
                        count++;
                        int aux = q[i];
                        q[i] = q[i + 1];
                        q[i + 1] = aux;
                        finished = false;
                    }
                }
            }
            if(tooMuch) {
                System.out.println("Too chaotic");
            } else {
                System.out.println(count);
            }
        }
    }
}