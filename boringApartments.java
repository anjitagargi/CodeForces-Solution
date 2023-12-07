package cf_striver;

import java.util.Scanner;

public class boringApartments {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            while (t-- > 0) {
                int x = scanner.nextInt();
                int digit = Character.getNumericValue(Integer.toString(x).charAt(0));

                int totalKeyPresses = (digit - 1) * 10;
                int length = Integer.toString(x).length();
                totalKeyPresses += (length * (length + 1)) / 2;

                System.out.println(totalKeyPresses);
            }
        }
    }


