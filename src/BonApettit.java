import java.util.Scanner;

// Bon Appétit
// https://www.hackerrank.com/challenges/bon-appetit
public class BonApettit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k[] = new int[2];
        for (int k_i = 0; k_i < k.length; k_i++) {
            k[k_i] = in.nextInt();
        }

        int dishes[] = new int[k[0]];
        for (int dishes_i = 0; dishes_i < dishes.length; dishes_i++) {
            dishes[dishes_i] = in.nextInt();
        }

        int charged = in.nextInt();

        int fairBill = 0;
        int totalAmount = 0;
        for(int i = 0; i < dishes.length; i++) {
            if(i != k[1]) {
                totalAmount += dishes[i];
            }
        }
        fairBill = totalAmount /= 2;

        if(charged == totalAmount) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(charged - fairBill);
        }

    }
}
