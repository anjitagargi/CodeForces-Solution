/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] giftGiver = new int[n];

        for (int i = 0; i < n; i++) {
            giftGiver[i] = scanner.nextInt();
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[giftGiver[i] - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
