package cf_striver;

import java.util.*;
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        // Calculate the total cost
        int totalCost = w * (w + 1) / 2 * k;

        // Calculate the amount to borrow
        int borrowAmount = Math.max(0, totalCost - n);

        // Output the result
        System.out.println(borrowAmount);
    }
}
