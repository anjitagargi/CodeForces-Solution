
import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] opinions = new int[n];
        for (int i = 0; i < n; i++) {
            opinions[i] = scanner.nextInt();
        }

        String result = problemDifficulty(n, opinions);
        System.out.println(result);
    }

    private static String problemDifficulty(int n, int[] opinions) {
        for (int opinion : opinions) {
            if (opinion == 1) {
                return "HARD";
            }
        }
        return "EASY";
    }
}
