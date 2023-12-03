import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        if (isNearlyLucky(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    private static boolean isNearlyLucky(long n) {
        String numberString = String.valueOf(n);

        int luckyCount = 0;
        for (int i = 0; i < numberString.length(); i++) {
            char digit = numberString.charAt(i);
            if (digit == '4' || digit == '7') {
                luckyCount++;
            }
        }

        return isLucky(luckyCount);
    }

    private static boolean isLucky(int number) {
        return number == 4 || number == 7 || number == 44 || number == 47 || number == 74 || number == 77 ||
                number == 444 || number == 447 || number == 474 || number == 477 || number == 744 || number == 747 || number == 774 || number == 777;
    }
}
