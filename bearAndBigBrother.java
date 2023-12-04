package cf_striver;

import java.util.*;
public class bearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int limakWeight = scanner.nextInt();
        int bobWeight = scanner.nextInt();

        // Calculate the number of years needed
        int years = 0;
        while (limakWeight <= bobWeight) {
            limakWeight *= 3;
            bobWeight *= 2;
            years++;
        }

        // Output the result
        System.out.println(years);
    }
}
