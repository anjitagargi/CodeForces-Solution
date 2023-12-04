package cf_striver;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowWithOne = 0;
        int colWithOne = 0;

        // Read the input matrix
        for (int i = 0; i < 5; i++) {
            String[] row = sc.nextLine().split(" ");
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(row[j]);
                if (num == 1) {
                    rowWithOne = i;
                    colWithOne = j;
                }
            }
        }

        // Calculate the minimum number of moves
        int moves = Math.abs(2 - rowWithOne) + Math.abs(2 - colWithOne);

        System.out.println(moves);
    }
}
