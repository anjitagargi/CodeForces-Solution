package cf_striver;

import java.util.*;
public class CplusEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int operations = 0;
            while (a <= n && b <= n) {
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }
                operations++;
            }

            System.out.println(operations);
        }

        scanner.close();

    }
}
