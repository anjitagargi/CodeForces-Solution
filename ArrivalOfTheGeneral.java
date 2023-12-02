import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();

        int mina = a, maxa = a, mini = 0, maxi = 0;

        for (int i = 1; i < n; ++i) {
            a = scanner.nextInt();

            if (a > maxa) {
                maxa = a;
                maxi = i;
            }
            if (a <= mina) {
                mina = a;
                mini = i;
            }
        }

        System.out.println(maxi + (n - 1 - mini) - (mini < maxi ? 1 : 0));
    }
}
